package com.test.example.factory.perfect;

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
     * 修改之后的思路:
     * 1.创建接口类和接口方法.
     * 2.创建需要创建的具体类和方法.实现接口类并实现接口方法
     * 3.创建工厂类和工厂方法.工厂方法返回接口对象(不那么暴力了)
     * 3.main方法测试.new一个工厂类.调用创建工厂方法返回接口类
     * @param args
     */
    public static void main(String[] args) {
        // 工厂方法不添加static的调用方式
        AnimalFactory af = new AnimalFactory();
        Animal cat = af.create("cat");
        cat.call();

        // 工厂方法添加static修饰后调用的方式
        Animal dog = AnimalFactory.create("dog");
        dog.call();
    }
}
