package com.tyy.create.builder;

/**
 * @author : tyy
 * @date : 2025/2/23 17:37
 * @Version: 1.0
 * @Desc :
 */
public class VegetableBurger extends Burger {

    @Override
    public String getName() {
        return "蔬菜汉堡";
    }

    @Override
    public float getPrice() {
        return 20f;
    }
}
