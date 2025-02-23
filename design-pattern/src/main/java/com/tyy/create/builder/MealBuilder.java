package com.tyy.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tyy
 * @date : 2025/2/23 17:47
 * @Version: 1.0
 * @Desc :
 */
public class MealBuilder {

    public static Meal prepareMeal() {
        Meal meal = new Meal();
        meal.addItem(new MeatBurger());
        meal.addItem(new ColaDrink());
        return meal;
    }
}
