package com.test.example.builder;

/**
 * @ClassName: ColdDrink
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:23
 */
public abstract class ColdDrink implements Item {

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
