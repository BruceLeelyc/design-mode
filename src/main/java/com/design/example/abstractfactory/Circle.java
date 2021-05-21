package com.design.example.abstractfactory;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 13:51
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆说我是不可缺少的形状.地球都跟我一样.");
    }
}
