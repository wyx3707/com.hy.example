package com.hy.designpattern.singleton.静态内部类;

public class Singleton {

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    /**
     * 静态内部类
     */
    public static class SingletonHolder {
        public static final Singleton SINGLETON = new Singleton();

    }
}
