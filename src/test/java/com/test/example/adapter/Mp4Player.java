package com.test.example.adapter;

/**
 * @ClassName: Mp4Player
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:23
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void aviPlayer(String fileName) {
        return;
    }

    @Override
    public void mp4Player(String fileName) {
        System.out.println("mp4 player file name="+fileName);
    }
}
