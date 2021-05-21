package com.test.example.builder;

/**
 * @ClassName: Bottle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:40
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }
}
