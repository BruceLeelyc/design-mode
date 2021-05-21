package com.test.example.factory;

/**
 * @ClassName: AnimalFactory
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 11:07
 */
public class AnimalFactory {

    public Object create(String type) {

        if (null == type || "".equals(type.trim())) {
            return null;
        }

        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        }

        return null;
    }
}
