package com.design.example.chain;

import java.util.logging.Logger;

/**
 * @ClassName: AbstractLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 17:59
 */
public abstract class AbstractLogger {
    public static int CONSOLE = 1;
    public static int DEBUG = 2;
    public static int INFO = 3;
    public static int ERROR = 4;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void loggerMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.loggerMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
