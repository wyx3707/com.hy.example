package com.hy.designpattern.adapter;

/**
 * @ClassName Test
 * @Desc TODO
 * @Author wyx
 * @Date 2018/6/11 14:29
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        Mp3Service mp3Service=new Mp3Impl();

        Adapter mp3Adapter = new Adapter(mp3Service);
        mp3Adapter.song();
        mp3Adapter.run();

    }
}
