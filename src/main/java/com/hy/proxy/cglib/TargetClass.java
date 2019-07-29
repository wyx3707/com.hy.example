package com.hy.proxy.cglib;

/**
 * 目标类
 *
 * @author WYX
 */
public class TargetClass {

    public void add() {
        System.out.println("com.hy.proxy.cglib.add()");
    }

    public void say(String s) {
        System.out.println("com.hy.proxy.cglib.say()" + s);
    }
}
