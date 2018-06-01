package com.hy.proxy.staticproxy;

public class ProxyClass implements IService {

    private Target target;

    public ProxyClass(Target target) {
        this.target = target;
    }

    @Override
    public void add() {
        System.out.println("我是扩展信息");
        target.add();
    }
}
