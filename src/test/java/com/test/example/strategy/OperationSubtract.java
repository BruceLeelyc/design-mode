package com.test.example.strategy;

/**
 * @ClassName: OperationSubtract
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 10:04
 */
public class OperationSubtract implements Strategy {
    @Override
    public int executeStrategy(int num1, int num2) {
        return num1 - num2;
    }
}
