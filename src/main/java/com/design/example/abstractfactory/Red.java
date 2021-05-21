package com.design.example.abstractfactory;

/**
 * @ClassName: Red
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:04
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色:红红火火.");
    }
}
