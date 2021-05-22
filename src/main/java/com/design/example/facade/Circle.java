package com.design.example.facade;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 16:22
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("动手画一个圆.");
    }
}
