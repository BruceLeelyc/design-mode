package com.design.example.factory;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 10:52
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is draw:circle");
    }
}
