package com.design.example.singleton;

/**
 * @ClassName: SingletonMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 23:56
 */
public class SingletonMain {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Singleton instance = Singleton.instance();
                    System.out.println(instance);
                }
            }).run();
        }
    }
}
