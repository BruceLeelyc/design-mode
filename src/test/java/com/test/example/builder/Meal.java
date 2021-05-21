package com.test.example.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Meal
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:29
 */
public class Meal {

    /**
     * 套餐都包含什么.需要一个list来承装
     */
    private List<Item> meals = new ArrayList();

    public void addItem(Item item) {
        meals.add(item);
    }

    public float getCost() {
        float price = 0.0f;
        for (Item item : meals) {
            price += item.price();
        }
        return price;
    }

    public void showItem() {
        for (Item item : meals) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }


}
