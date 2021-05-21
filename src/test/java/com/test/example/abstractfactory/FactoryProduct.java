package com.test.example.abstractfactory;

/**
 * @ClassName: FactoryProduct
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:37
 */
public class FactoryProduct {

    public static AbstractFactory getFactory(String factory) {
        if ("shape".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        } else if ("color".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        }

        return null;
    }
}
