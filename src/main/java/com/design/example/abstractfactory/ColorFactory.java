package com.design.example.abstractfactory;

/**
 * @ClassName: ColorFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:12
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (null == color || "".equals(color.trim())) {
            return null;
        }
        if ("red".equalsIgnoreCase(color.trim())) {
            return new Red();
        } else if ("blue".equalsIgnoreCase(color.trim())) {
            return new Blue();
        }
        return null;
    }
}
