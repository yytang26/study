package com.tyy.create.factory.abstractfactory;

import com.tyy.create.factory.model.Color;
import com.tyy.create.factory.model.Shape;

public class Main {

    public static void main(String[] args) {
        AbstractFactory color = FactoryProvider.getFactory("COLOR");
        Color red = color.getColor("RED");
        red.fill();
        Color blue = color.getColor("BLUE");
        blue.fill();

        AbstractFactory shape = FactoryProvider.getFactory("SHAPE");
        Shape circle = shape.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = shape.getShape("RECTANGLE");
        rectangle.draw();
    }
}
