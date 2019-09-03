package com.hy.designpattern.singleton.饿汉式;

public class Singleton {

    //私有构造
    private Singleton() {
    }

    private static final Singleton SINGLETON = new Singleton();

    public static Singleton getInstance() {
        return SINGLETON;
    }
}
