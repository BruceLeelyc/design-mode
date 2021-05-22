package com.test.example.adapter;

/**
 * @ClassName: MediaAdaptor
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:27
 */
public class MediaAdaptor implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaptor(String audioType) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            return;
        } else if ("avi".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new AviPlayer();
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("player mp3 file name = "+fileName);
        } else if ("avi".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.aviPlayer(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer.mp4Player(fileName);
        }
    }
}
