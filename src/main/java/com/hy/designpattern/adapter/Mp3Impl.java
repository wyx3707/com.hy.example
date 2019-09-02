package com.hy.designpattern.adapter;

/**
 * @ClassName Mp3Impl
 * @Desc TODO
 * @Author wyx
 * @Date 2018/6/11 14:03
 * @Version 1.0
 */
public class Mp3Impl implements Mp3Service {
    @Override
    public void song() {
        System.out.println("mp3");
    }
}
