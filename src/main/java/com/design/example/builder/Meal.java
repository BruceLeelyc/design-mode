package com.design.example.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Meal
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:15
 */
public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost() {
        float price = 0.0f;
        for (Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }


}
