package com.hy.wait_and_notify;

import java.util.UUID;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-16 08:19
 **/
public class Client extends Thread {

    private String lock;

    /**
     * Allocates a new {@code Thread} object. This constructor has the same
     * effect as {@linkplain #Thread(ThreadGroup, Runnable, String) Thread}
     * {@code (null, null, gname)}, where {@code gname} is a newly generated
     * name. Automatically generated names are of the form
     * {@code "Thread-"+}<i>n</i>, where <i>n</i> is an integer.
     */
    public Client(String lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    String value = ValueObject.value;
                    System.out.println(Thread.currentThread().getName() + "get value:" + value);
                    ValueObject.value = "";
                    lock.notify();
                }
            }
        }
    }
}
