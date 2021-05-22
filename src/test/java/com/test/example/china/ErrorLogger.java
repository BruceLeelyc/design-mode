package com.test.example.china;

/**
 * @ClassName: ErrorLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 20:16
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("print error logger:" + message);
    }
}
