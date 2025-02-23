package com.tyy.create.factory.abstractfactory;

import com.tyy.create.factory.model.Blue;
import com.tyy.create.factory.model.Color;
import com.tyy.create.factory.model.Red;
import com.tyy.create.factory.model.Shape;

/**
 * @Program: study
 * @Description:
 * @Author: tyy
 * @Date: 2025-02-23 16:16
 * @Version: 1.0
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "RED" :
                return new Red();
            case "BLUE":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String type) {
        return null;
    }
}

