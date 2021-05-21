package com.design.example.abstractfactory;

/**
 * @ClassName: FactoryProducer
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 14:13
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (null == choice || "".equals(choice.trim())) {
        }

        if("SHAPE".equalsIgnoreCase(choice.trim())){
            return new ShapeFactory();
        } else if("COLOR".equalsIgnoreCase(choice.trim())){
            return new ColorFactory();
        }
        return null;
    }
}
