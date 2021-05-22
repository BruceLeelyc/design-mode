package com.design.example.decorator;

/**
 * @ClassName: DecoratorMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:37
 */
public class DecoratorMain {

    public static void main(String[] args) {
        System.out.println("装饰前样式:");
        Circle circle = new Circle();
        circle.draw();
        System.out.println("");
        System.out.println("红色边框装饰后样式:");
        RedBorderDecorator circleDecorator = new RedBorderDecorator(new Circle());
        circleDecorator.draw();

        System.out.println("");
        System.out.println("");
        System.out.println("装饰前样式:");
        Square square = new Square();
        square.draw();
        System.out.println("");
        System.out.println("红色边框装饰后模式:");
        RedBorderDecorator squareDecorator = new RedBorderDecorator(new Square());
        squareDecorator.draw();

    }
}
