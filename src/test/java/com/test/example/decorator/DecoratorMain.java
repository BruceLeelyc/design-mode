package com.test.example.decorator;

/**
 * @ClassName: DecoratorMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:50
 */
public class DecoratorMain {

    public static void main(String[] args) {

        System.out.println("装饰模式之前的样式:");
        Circle circle = new Circle();
        circle.draw();
        System.out.println("");
        System.out.println("装饰模式添加边框之后的样式:");
        BlueBorderDecorator circleDecorator = new BlueBorderDecorator(circle);
        circleDecorator.draw();

        System.out.println("");
        System.out.println();

        System.out.println("装饰模式之前的样式:");
        Square square = new Square();
        square.draw();
        System.out.println();
        System.out.println("装饰模式添加边框之后的样式:");
        BlueBorderDecorator squareDecorator = new BlueBorderDecorator(new Square());
        squareDecorator.draw();
    }
}
