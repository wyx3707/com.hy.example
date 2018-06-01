package com.hy.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        Target target=new Target();
        ProxyClass proxyClass=new ProxyClass(target);
        proxyClass.add();
    }
}
