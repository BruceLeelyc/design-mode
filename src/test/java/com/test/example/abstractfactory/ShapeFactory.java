package com.test.example.abstractfactory;

/**
 * @ClassName: ShapeFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:29
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        if (null == shape || "".equals(shape.trim())) {
            return null;
        }
        if ("circle".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
