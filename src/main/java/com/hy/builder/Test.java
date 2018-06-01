package com.hy.builder;

public class Test {
    public static void main(String[] args) {
        //第一步：生成代理类
        MyBuilderClass.copyClass copyClass = new MyBuilderClass.copyClass();
        //第二步：向代理类赋值
        copyClass.address("xt");
        //第三步：通过代理类生成真实类
        MyBuilderClass builder = copyClass.builder();
        //这样就可以通过给代理类赋不同的属性值来生产真实类
        System.out.println(builder.getAddress());
        System.out.println(builder.getAge());
    }
}
