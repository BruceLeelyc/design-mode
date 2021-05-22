package com.test.example.adapter;

/**
 * @ClassName: AudioPlayer
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:33
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdaptor mediaAdaptor;

    @Override
    public void play(String audioType, String fileName) {
        if ("mp4".equalsIgnoreCase(audioType)) {
            mediaAdaptor = new MediaAdaptor(audioType);
            mediaAdaptor.play(audioType, fileName);
        } else if ("avi".equalsIgnoreCase(audioType)) {
            mediaAdaptor = new MediaAdaptor(audioType);
            mediaAdaptor.play(audioType, fileName);
        } else {
            System.out.println("暂时不支持"+audioType+"格式播放.");
        }
    }
}
