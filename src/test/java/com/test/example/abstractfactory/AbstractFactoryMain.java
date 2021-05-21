package com.test.example.abstractfactory;

import com.design.example.abstractfactory.FactoryProducer;

/**
 * @ClassName: AbstractFactoryMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:40
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {
        AbstractFactory shape = FactoryProduct.getFactory("shape");
        Shape circle = shape.getShape("circle");
        circle.draw();
        Shape square = shape.getShape("square");
        square.draw();

        AbstractFactory color = FactoryProduct.getFactory("color");
        Color red = color.getColor("red");
        red.fill();
        Color blue = color.getColor("blue");
        blue.fill();

    }
}
