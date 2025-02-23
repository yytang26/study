package com.tyy.create.factory.simplefactory;

import com.tyy.create.factory.model.Circle;
import com.tyy.create.factory.model.Rectangle;
import com.tyy.create.factory.model.Shape;

/**
 * @Program: study
 * @Description:
 * @Author: tyy
 * @Date: 2025-02-23 15:58
 * @Version: 1.0
 */
public class SimpleFactory {

    public static Shape getShape(String type) {
        switch (type) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
        }
        return null;
    }
}

