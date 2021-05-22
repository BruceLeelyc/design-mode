package com.design.example.proxy;

/**
 * @ClassName: ProxyMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 16:46
 */
public class ProxyMain {

    public static void main(String[] args) {

        Image image = new ProxyImage("proxy.jpeg");
        System.out.println("图片将从磁盘加载.");
        image.display();
        System.out.println("图片不需要从磁盘加载.");
        image.display();
    }
}
