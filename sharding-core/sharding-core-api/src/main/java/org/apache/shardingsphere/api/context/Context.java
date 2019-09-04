package org.apache.shardingsphere.api.context;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-09-03
 */
public class Context {

    public static final User NULL = new User();

    public static final ThreadLocal<User> CONNECTION = ThreadLocal.withInitial(()->NULL);

    /**
     *  key : userName
     *  value : 路由的数据源名称
     */
    public static final ConcurrentHashMap<String,String> USER_SCHEMA = new ConcurrentHashMap<>();

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class User{
        private String userName;
    }

}
