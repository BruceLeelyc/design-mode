package com.design.example.abstractfactory;

/**
 * @ClassName: Blue
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:04
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("蓝色:蔚蓝的天空.");
    }
}
