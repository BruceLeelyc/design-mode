package com.design.example.builder;

/**
 * @ClassName: chips
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:36
 */
public class chips extends Burger {
    @Override
    public String name() {
        return "chips";
    }

    @Override
    public float price() {
        return 0.6f;
    }
}
