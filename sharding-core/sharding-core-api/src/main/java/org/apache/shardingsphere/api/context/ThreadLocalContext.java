package org.apache.shardingsphere.api.context;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-09-03
 */
public class ThreadLocalContext {

    public static final Object NULL = new Object();

    public static final ThreadLocal<Object> CONNECTION = ThreadLocal.withInitial(()->NULL);

    @AllArgsConstructor
    @Getter
    @Setter
    public static class User{
        private String userName;
    }

}
