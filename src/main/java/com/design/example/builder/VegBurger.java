package com.design.example.builder;

/**
 * @ClassName: VegBurger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:05
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg burger";
    }

    @Override
    public float price() {
        return 18.9f;
    }
}
