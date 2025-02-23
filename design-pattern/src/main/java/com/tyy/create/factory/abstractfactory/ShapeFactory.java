package com.tyy.create.factory.abstractfactory;

import com.tyy.create.factory.model.*;

/**
 * @Program: study
 * @Description:
 * @Author: tyy
 * @Date: 2025-02-23 16:16
 * @Version: 1.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        switch (type) {
            case "CIRCLE" :
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}

