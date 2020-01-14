package com.hy.java8.pack;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2019-12-17 20:33
 **/
public class Client {
    public static void main(String[] args) {
        IBaseFace iBaseFace = (s)-> System.out.println(s);
        ;
        iBaseFace.sy("wyx");
    }
}
