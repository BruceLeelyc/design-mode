package com.design.example.abstractfactory;

/**
 * @ClassName: ShapeFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:11
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (null == type || "".equals(type.trim())) {
            return null;
        }
        if ("circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("square".equalsIgnoreCase(type)) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
