package com.test.example.china;

/**
 * @ClassName: DebugLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 20:15
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("print debug logger:" + message);
    }
}
