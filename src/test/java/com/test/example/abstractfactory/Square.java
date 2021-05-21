package com.test.example.abstractfactory;

/**
 * @ClassName: Square
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:26
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("右手跟再画一个方.");
    }
}
