package com.design.example.strategy;

/**
 * @ClassName: StrategyAdd
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 21:10
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
