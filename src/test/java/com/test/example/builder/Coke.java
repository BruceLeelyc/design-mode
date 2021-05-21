package com.test.example.builder;

/**
 * @ClassName: Coke
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:23
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 8.8f;
    }
}
