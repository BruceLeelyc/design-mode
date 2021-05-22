package com.design.example.decorator;

/**
 * @ClassName: RedBorderDecorator
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:33
 */
public class RedBorderDecorator extends ShapeDecorator {
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw() {
        decoratorShape.draw();
        drawRedBorder(decoratorShape);
    }

    public void drawRedBorder(Shape decoratedShape) {
        System.out.println("添加一个红色边框.");
    }
}
