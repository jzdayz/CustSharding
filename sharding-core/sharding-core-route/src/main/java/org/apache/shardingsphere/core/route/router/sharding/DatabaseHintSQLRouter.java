/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.route.router.sharding;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.api.context.ThreadLocalContext;
import org.apache.shardingsphere.core.optimize.transparent.statement.TransparentOptimizedStatement;
import org.apache.shardingsphere.core.parse.core.SQLParseKernel;
import org.apache.shardingsphere.core.parse.core.rule.registry.ParseRuleRegistry;
import org.apache.shardingsphere.core.parse.sql.segment.SQLSegment;
import org.apache.shardingsphere.core.parse.sql.segment.generic.TableSegment;
import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;
import org.apache.shardingsphere.core.route.SQLRouteResult;
import org.apache.shardingsphere.core.route.type.RoutingResult;
import org.apache.shardingsphere.core.route.type.RoutingUnit;
import org.apache.shardingsphere.core.route.type.TableUnit;
import org.apache.shardingsphere.core.rule.ShardingRule;
import org.apache.shardingsphere.spi.database.DatabaseType;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Sharding router for hint database only.
 *
 * @author zhangliang
 * @author maxiaoguang
 */
// TODO removed after all ANTLR parser finished
@RequiredArgsConstructor
public final class DatabaseHintSQLRouter implements ShardingRouter {

    private final DatabaseType databaseType;

    private final ShardingRule shardingRule;

    @Override
    public SQLStatement parse(final String logicSQL, final boolean useCache) {
        return new SQLParseKernel(ParseRuleRegistry.getInstance(), databaseType, logicSQL).parse();
    }

    public static String SYMBOL = "_";

    static {
        SYMBOL = System.getProperty("route.symbol",SYMBOL);
    }

    @Override
    public SQLRouteResult route(final String logicSQL, final List<Object> parameters, final SQLStatement sqlStatement) {

        ThreadLocalContext.User user = (ThreadLocalContext.User) ThreadLocalContext.CONNECTION.get();
        if (user != ThreadLocalContext.NULL){
            String userName = user.getUserName();
            System.err.println(userName);
        }

        SQLRouteResult result = new SQLRouteResult(new TransparentOptimizedStatement(sqlStatement));

        // 路由结果
        RoutingResult routingResult = new RoutingResult();

        // 路由的表和dataSourceName
        Collection<RoutingUnit> routingUnits = routingResult.getRoutingUnits();

        // only one db
        shardingRule.getShardingDataSourceNames().getDataSourceNames().forEach(e-> routingUnits.add(new RoutingUnit(e)));

        // db -> route info
        Map<String, RoutingUnit> dataNameRouting =
                routingUnits.stream().collect(Collectors.toMap(RoutingUnit::getDataSourceName, Function.identity()));

        boolean allowDelete = false;

        for (SQLSegment segment : sqlStatement.getAllSQLSegments()) {
            if (segment instanceof TableSegment){
                String logicTable = ((TableSegment) segment).getTableName();
                int index = logicTable.indexOf(SYMBOL);
                if (index == -1){
                    throw new RuntimeException();
                }

                String db = logicTable.substring(0,index);
                String realTable = logicTable.substring(index+1);

                // tables
                List<TableUnit> tableUnits = dataNameRouting.get(db).getTableUnits();
                TableUnit tableUnit = new TableUnit(logicTable,realTable);
                tableUnits.add(tableUnit);
                allowDelete = true;
            }
        }

        result.setRoutingResult(routingResult);

        // 剔除没有table的 TableUnits
        if(allowDelete) {
            routingResult.getRoutingUnits().removeIf(unit -> unit.getTableUnits().size() == 0);
        }

        return result;
    }

}
