package com.test.example.decorator;

/**
 * @ClassName: BlueBorderDecorator
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:46
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
