package com.design.example.builder;

/**
 * @ClassName: ChickenBurger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:06
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 26.8f;
    }
}
