package com.design.example.facade;

/**
 * @ClassName: ShapeMaker
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 16:24
 */
public class ShapeMaker {

    private Circle circle;

    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
