package com.test.example.china;

/**
 * @ClassName: FileLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 20:15
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("print file logger:" + message);
    }
}
