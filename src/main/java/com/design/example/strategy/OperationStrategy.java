package com.design.example.strategy;

import javax.management.OperationsException;

/**
 * @ClassName: OperationStrategy
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 21:15
 */
public class OperationStrategy {

    private Strategy strategy;

    public OperationStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
