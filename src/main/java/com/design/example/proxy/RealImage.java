package com.design.example.proxy;

/**
 * @ClassName: RealImage
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 16:42
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        this.loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
