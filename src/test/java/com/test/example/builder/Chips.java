package com.test.example.builder;

/**
 * @ClassName: Chips
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:46
 */
public class Chips extends Snacks {
    @Override
    public String name() {
        return "chips";
    }

    @Override
    public float price() {
        return 6.8f;
    }
}
