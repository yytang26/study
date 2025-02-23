package com.tyy.create.builder;

/**
 * @author : tyy
 * @date : 2025/2/23 17:37
 * @Version: 1.0
 * @Desc :
 */
public interface Item {


    /**
     * 食物名称
     *
     * @return
     */
    String getName();

    /**
     * 食物包装
     *
     * @return
     */
    Packing getPacking();

    /**
     * 食物价格
     *
     * @return
     */
    float getPrice();


}
