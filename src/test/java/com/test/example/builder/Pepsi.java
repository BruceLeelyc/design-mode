package com.test.example.builder;

/**
 * @ClassName: Pepsi
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:24
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 6.8f;
    }
}
