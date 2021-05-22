package com.test.example.china;

/**
 * @ClassName: ChinaMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 20:17
 */
public class ChinaMain {

    public static void main(String[] args) {

        AbstractLogger chinaLogger = getChinaLogger();

        chinaLogger.printMessage(AbstractLogger.ERROR, "This is error logger.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
        chinaLogger.printMessage(AbstractLogger.FILE, "This is file logger.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
        chinaLogger.printMessage(AbstractLogger.DEBUG, "This is debug logger.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``");
        chinaLogger.printMessage(AbstractLogger.CONSOLE, "This is console logger.");

    }

    private static ErrorLogger getChinaLogger() {
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.CONSOLE);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        FileLogger fileLogger = new FileLogger(AbstractLogger.FILE);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
