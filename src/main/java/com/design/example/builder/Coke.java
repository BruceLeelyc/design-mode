package com.design.example.builder;

/**
 * @ClassName: Coke
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:06
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 8f;
    }
}
