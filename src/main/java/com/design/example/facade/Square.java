package com.design.example.facade;

/**
 * @ClassName: Square
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 16:23
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个正方形.");
    }
}
