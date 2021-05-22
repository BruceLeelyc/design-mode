package com.test.example.china;

import java.io.Console;

/**
 * @ClassName: ConsoleLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 20:12
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("print console logger:" + message);
    }
}
