package com.tyy.create.builder;

/**
 * @author : tyy
 * @date : 2025/2/23 17:37
 * @Version: 1.0
 * @Desc :
 */
public abstract class Drink implements Item {

    @Override
    public Packing getPacking() {
        return new BottlePacking();
    }
}
