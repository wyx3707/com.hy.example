package com.hy.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-17 14:13
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = newFixedThreadPool(2);
        MyCallable myCallable=new MyCallable();
        Future<MyCallableDTO> submit = executorService.submit(myCallable);
        MyCallableDTO myCallableDTO = submit.get();
        System.out.println(Thread.currentThread().getName());
        System.out.println(myCallableDTO.getName());
    }
}
