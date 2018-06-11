package com.hy.adapter;

/**
 * @ClassName Mp3Adapter
 * @Desc TODO
 * @Author wyx
 * @Date 2018/6/11 14:07
 * @Version 1.0
 */
public class Mp3Adapter implements Mp3Service {

    private Mp4Service mp4Service;

    public Mp3Adapter(Mp4Service mp4Service) {
        this.mp4Service = mp4Service;
    }

    @Override
    public void song() {
        mp4Service.song();
    }
}
