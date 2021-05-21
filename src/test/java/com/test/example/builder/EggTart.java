package com.test.example.builder;

/**
 * @ClassName: Eggtart
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 17:47
 */
public class EggTart extends Snacks{

    @Override
    public String name() {
        return "Egg tart";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
