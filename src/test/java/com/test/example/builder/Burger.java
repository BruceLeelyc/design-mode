package com.test.example.builder;

/**
 * @ClassName: Burger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 16:43
 *
 * 1.思考,包装形式是固定的->直接实现
 * 2.价格和名字是需要子类具体实现
 */
public abstract class Burger implements Item{

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
