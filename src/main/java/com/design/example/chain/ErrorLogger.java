package com.design.example.chain;

/**
 * @ClassName: ErrorLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 18:20
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("print error logger:" + message);
    }
}
