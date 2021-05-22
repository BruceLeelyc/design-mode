package com.test.example.decorator;

/**
 * @ClassName: Square
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:45
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("decorator draw square.");
    }
}
