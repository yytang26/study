package com.tyy.create.factory.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String type) {
        switch (type) {
            case "COLOR":
                return new ColorFactory();
            case "SHAPE":
                return new ShapeFactory();
        }
        return null;
    }
}
