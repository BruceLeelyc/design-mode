package com.design.example.chain;

/**
 * @ClassName: DebugLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 18:40
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("pring debug logger:" + message);
    }
}
