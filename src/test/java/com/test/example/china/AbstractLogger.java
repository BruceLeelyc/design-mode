package com.test.example.china;

/**
 * @ClassName: AbstractLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 19:15
 */
public abstract class AbstractLogger {

    public static final int CONSOLE = 1;
    public static final int DEBUG = 2;
    public static final int FILE = 3;
    public static final int ERROR = 4;

    private int level;

    private AbstractLogger nextLogger;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void printMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }

        if (null != nextLogger) {
            nextLogger.printMessage(level, message);
        }

    }

    protected abstract void write(String message);

}
