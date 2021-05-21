package com.design.example.factory;

/**
 * @ClassName: ShapeFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 10:51
 */
public class ShapeFactory {

    public static Shape create(String type) {
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
}
