package com.test.example.strategy;

/**
 * @ClassName: OperationAdd
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 10:03
 */
public class OperationAdd implements Strategy {
    @Override
    public int executeStrategy(int num1, int num2) {
        return num1 + num2;
    }
}
