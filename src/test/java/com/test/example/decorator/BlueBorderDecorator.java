package com.test.example.decorator;

/**
 * @ClassName: BlueBorderDecorator
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:49
 */
public class BlueBorderDecorator extends ShapeDecorator {
    BlueBorderDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    public void draw() {
        decoratorShape.draw();
        drawBlueBorder(decoratorShape);
    }

    private void drawBlueBorder(Shape decoratorShape) {
        System.out.println("添加一个蓝色边框.nice!");
    }
}
