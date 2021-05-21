package com.test.example.singleton;

/**
 * @ClassName: Singleton
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/21 15:05
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton() {}

    public static Singleton instance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

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
