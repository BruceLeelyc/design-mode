package com.design.example.strategy;

/**
 * @ClassName: OperationMultiply
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 21:14
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
