package com.test.example.strategy;

/**
 * @ClassName: StrategyMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/24 10:07
 */
public class StrategyMain {

    public static void main(String[] args) {
        OperationStrategy strategy = new OperationStrategy(new OperationAdd());
        System.out.println(strategy.execute(3, 3));
        strategy = new OperationStrategy(new OperationSubtract());
        System.out.println(strategy.execute(3, 3));
        strategy = new OperationStrategy(new OperationMultiply());
        System.out.println(strategy.execute(3, 3));
        System.out.println(666);
    }
}
