package com.design.example.adapter;

/**
 * @ClassName: Mp4Player
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:05
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        return;
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("player mp4 file name="+fileName);
    }
}
