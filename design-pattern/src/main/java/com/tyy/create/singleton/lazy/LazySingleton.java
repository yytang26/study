package com.tyy.create.singleton.lazy;

/**
 * @author : tyy
 * @date : 2025/2/23 17:17
 * @Version: 1.0
 * @Desc :
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public static synchronized LazySingleton getInstanceSafe() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
