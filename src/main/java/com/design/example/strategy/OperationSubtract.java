package com.design.example.strategy;

/**
 * @ClassName: StrategySub
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 21:11
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
