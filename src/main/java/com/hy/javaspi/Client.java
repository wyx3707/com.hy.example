package com.hy.javaspi;

import java.util.ServiceLoader;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-01-06 12:09
 **/
public class Client {
    public static void main(String[] args) {
        ServiceLoader<IStudent> load = ServiceLoader.load(IStudent.class);
        for (IStudent iStudent : load) {
            iStudent.sayHello();
        }
    }
}
