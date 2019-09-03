package com.hy.designpattern.singleton.枚举式;

public class Singleton {

    public static Singleton getInstance() {

        return EnumSingleton.SINGLETON.getInstance();
    }
}


enum EnumSingleton {
    SINGLETON;

    private Singleton singleton;

    EnumSingleton() {
        singleton = new Singleton();
    }

    public Singleton getInstance() {
        return singleton;
    }

}