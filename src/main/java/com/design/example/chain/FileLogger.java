package com.design.example.chain;

/**
 * @ClassName: FileLogger
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 18:19
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("print file logger:"+message);
    }
}
