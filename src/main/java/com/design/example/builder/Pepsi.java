package com.design.example.builder;

/**
 * @ClassName: Pepsi
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:06
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 9.9f;
    }
}
