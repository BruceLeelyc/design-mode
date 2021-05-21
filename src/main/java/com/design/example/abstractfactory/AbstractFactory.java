package com.design.example.abstractfactory;

/**
 * @ClassName: AbstractFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:05
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);
}
