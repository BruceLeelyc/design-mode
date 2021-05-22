package com.test.example.adapter;

/**
 * @ClassName: AdapterMain
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:45
 */
public class AdapterMain {

    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp4", "belong to you");
        player.play("avi", "what do you want");
        player.play("mp3", "all alone");
        player.play("vlc", "with you clouds far away");
    }
}
