package com.hy.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        TargetClass p = new TargetClass();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(p.getClass());
        enhancer.setCallback(new DemoInterceptor());
        TargetClass o1 = (TargetClass) enhancer.create();
        o1.say("exgs");
        o1.add();
    }
}
