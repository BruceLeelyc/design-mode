package com.design.example.factory;

/**
 * @ClassName: Square
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 10:53
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("this is draw:square");
    }
}
