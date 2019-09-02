package com.hy.designpattern.factory.simplefactory;

/**
 * 简单工厂模式
 * 步骤：创建一个
 */
public class Test {
    public static void main(String[] args) {
        PizzFactory pizzFactory = new PizzFactory();
        Client client = new Client(pizzFactory);
        client.run();
    }
}
