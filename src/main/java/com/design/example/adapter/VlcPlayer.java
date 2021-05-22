package com.design.example.adapter;

/**
 * @ClassName: VlcPlayer
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:03
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("player vlc file: name="+fileName);
    }

    @Override
    public void playMp4(String fileName) {
        return;
    }
}
