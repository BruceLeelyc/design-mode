package com.test.example.abstractfactory;

import sun.security.provider.SHA;

/**
 * @ClassName: Circle
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:24
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("来左手跟我一起画一个圆.");
    }
}
