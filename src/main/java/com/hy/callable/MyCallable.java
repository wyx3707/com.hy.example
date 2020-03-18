package com.hy.callable;

import java.util.concurrent.Callable;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-17 14:06
 **/
public class MyCallable implements Callable<MyCallableDTO> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public MyCallableDTO call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return MyCallableDTO.con("wyx");
    }
}
