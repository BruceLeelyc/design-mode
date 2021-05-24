package com.test.example.strategy;

/**
 * @ClassName: OperationStrategy
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 10:05
 */
public class OperationStrategy {

    private Strategy strategy;

    public OperationStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.executeStrategy(num1, num2);
    }
}
