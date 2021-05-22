package com.test.example.decorator;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:44
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("decorator draw circle.");
    }
}
