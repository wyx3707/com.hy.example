package com.hy.wait_and_notify;

import java.util.UUID;

/**
 * @program: demo
 * @description: 生产者
 * @author: wyx
 * @create: 2020-03-16 08:13
 **/
public class Product extends Thread {

    private String lock;


    public Product(String lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    ValueObject.value = UUID.randomUUID().toString();
                    System.out.println(Thread.currentThread().getName() + "set value:" + ValueObject.value);
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
