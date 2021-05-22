package com.design.example.decorator;

/**
 * @ClassName: ShapeDecorator
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:31
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape shapeDecorator) {
        this.decoratorShape = shapeDecorator;
    }

    public void draw() {
        decoratorShape.draw();
    }
}
