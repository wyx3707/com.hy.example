package com.hy.adapter;

/**
 * @ClassName Test
 * @Desc TODO
 * @Author wyx
 * @Date 2018/6/11 14:29
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Mp4Service mp4Service = new Mp4Impl();

        Mp3Adapter mp3Adapter = new Mp3Adapter(mp4Service);
        mp3Adapter.song();

    }
}
