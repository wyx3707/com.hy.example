package com.hy.adapter;

/**
 * @ClassName Adapter
 * @Desc TODO
 * @Author wyx
 * @Date 2018/6/11 14:07
 * @Version 1.0
 */
public class Adapter extends Mp4Impl implements Mp3Service {

    private Mp3Service mp3Service;

    Adapter(Mp3Service mp3Service) {
        this.mp3Service = mp3Service;
    }

    @Override
    public void song() {
        mp3Service.song();
    }
}
