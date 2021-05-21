package com.test.example.abstractfactory;

/**
 * @ClassName: Red
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:28
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("添加红色,红色");
    }
}
