package com.test.example.adapter;

/**
 * @ClassName: AviPlayer
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:24
 */
public class AviPlayer implements AdvancedMediaPlayer {
    @Override
    public void aviPlayer(String fileName) {
        System.out.println("avi player file name="+fileName);
    }

    @Override
    public void mp4Player(String fileName) {
        return;
    }
}
