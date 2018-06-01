package com.hy.proxy.staticproxy;

public class Target implements IService {
    @Override
    public void add() {
        System.out.println("我是目标类的add");
    }
}
