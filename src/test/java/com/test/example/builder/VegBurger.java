package com.test.example.builder;

/**
 * @ClassName: VegBurger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:22
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public float price() {
        return 16.8f;
    }
}
