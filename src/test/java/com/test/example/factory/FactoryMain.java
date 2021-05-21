package com.test.example.factory;

/**
 * @ClassName: FactoryMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 11:11
 */
public class FactoryMain {

    /**
     * 本人写工厂方法最简单的思路:
     * 1.创建工厂类和工厂方法.工厂方法直接暴力返回Object
     * 2.创建需要创建的具体类和方法.
     * 3.main方法测试.new一个工厂类.调用创建工厂方法.强转
     *
     * @param args
     */
    public static void main(String[] args) {

        AnimalFactory af = new AnimalFactory();
        // 强转的方式有待优化
        Cat cat = (Cat)af.create("cat");
        cat.call();

        Dog dog = (Dog)af.create("dog");
        dog.call();
    }
}
