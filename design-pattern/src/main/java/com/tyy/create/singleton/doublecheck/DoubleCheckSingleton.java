package com.tyy.create.singleton.doublecheck;

/**
 * @author : tyy
 * @date : 2025/2/23 17:21
 * @Version: 1.0
 * @Desc :
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
