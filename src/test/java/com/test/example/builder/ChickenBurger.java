package com.test.example.builder;

/**
 * @ClassName: ChickenBurger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:23
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 26.9f;
    }
}
