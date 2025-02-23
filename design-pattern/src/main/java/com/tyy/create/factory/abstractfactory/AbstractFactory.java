package com.tyy.create.factory.abstractfactory;

import com.tyy.create.factory.model.Color;
import com.tyy.create.factory.model.Shape;

/**
 * @Program: study
 * @Description:
 * @Author: tyy
 * @Date: 2025-02-23 16:15
 * @Version: 1.0
 */
public abstract class AbstractFactory {

    /**
     * 获取形状
     *
     * @param type
     * @return
     */
    abstract Shape getShape(String type);

    /**
     * 获取颜色
     *
     * @param color
     * @return
     */
    abstract Color getColor(String color);
}

