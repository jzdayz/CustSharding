package org.apache.shardingsphere.core.route.router.sharding;

import org.apache.shardingsphere.core.parse.sql.statement.SQLStatement;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-09-02
 */
public class Tables {

    public static final ThreadLocal<SQLStatement> SQL_STATEMENT = new ThreadLocal<>();

}
