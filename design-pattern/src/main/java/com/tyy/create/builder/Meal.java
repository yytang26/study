package com.tyy.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : tyy
 * @date : 2025/2/23 17:50
 * @Version: 1.0
 * @Desc :
 */
public class Meal {

    private static List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItem() {
        return items;
    }

    public float getCost() {
        float sum = 0.0f;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}
