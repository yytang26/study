package com.tyy.create.singleton.staticinnerclass;

/**
 * @author : tyy
 * @date : 2025/2/23 17:22
 * @Version: 1.0
 * @Desc :
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    static class SingletonHolder {
        private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }
}
