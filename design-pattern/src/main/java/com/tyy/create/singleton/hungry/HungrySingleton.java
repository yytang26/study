package com.tyy.create.singleton.hungry;

/**
 * @author : tyy
 * @date : 2025/2/23 17:15
 * @Version: 1.0
 * @Desc : 饿汉式：线程安全
 */
public class HungrySingleton {

    private HungrySingleton() {

    }

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}

