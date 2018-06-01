package com.hy.java8.thead_runnable;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch,是一个倒计时器，是控制线程等待，直到倒计时器归0再继续执行
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(5);

        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        cdl.countDown();
                    }
                };
            }.start();
        }

            cdl.wait();

        System.out.println("主线程继续执行");
    }
}
