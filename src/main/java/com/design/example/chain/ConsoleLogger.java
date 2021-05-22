package com.design.example.chain;

/**
 * @ClassName: ConsoleLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 18:18
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("print Console::Logger: "+message);
    }
}
