package com.design.example.decorator;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:28
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("装饰模式.画一个圆.");
    }
}
