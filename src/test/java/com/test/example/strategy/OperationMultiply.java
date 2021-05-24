package com.test.example.strategy;

/**
 * @ClassName: OperationMultiply
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 10:05
 */
public class OperationMultiply implements Strategy {
    @Override
    public int executeStrategy(int num1, int num2) {
        return num1 * num2;
    }
}
