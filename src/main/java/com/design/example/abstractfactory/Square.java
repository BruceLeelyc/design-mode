package com.design.example.abstractfactory;

/**
 * @ClassName: Square
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 13:53
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("方块说:我也是挺美的.");
    }
}
