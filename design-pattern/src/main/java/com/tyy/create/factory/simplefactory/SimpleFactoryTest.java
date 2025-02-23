package com.tyy.create.factory.simplefactory;

import com.tyy.create.factory.model.Shape;
import com.tyy.create.factory.simplefactory.SimpleFactory;

/**
 * @Program: study
 * @Description:
 * @Author: tyy
 * @Date: 2025-02-23 16:02
 * @Version: 1.0
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Shape circle = SimpleFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = SimpleFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}

