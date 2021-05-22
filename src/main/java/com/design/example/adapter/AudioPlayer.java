package com.design.example.adapter;

/**
 * @ClassName: AudioPlayer
 * @Description:
 * @Author: lixl
 * @Date: 2021/5/22 11:10
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String fileName) {
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("player mp3 file name="+fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
