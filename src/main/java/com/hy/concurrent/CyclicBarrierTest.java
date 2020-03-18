package com.hy.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-17 15:30
 **/
public class CyclicBarrierTest {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        for (int i = 0; i < 4; i++) {
            new Exces(cyclicBarrier).start();
        }
    }


    static class Exces extends Thread {
        CyclicBarrier cyclicBarrier;

        public Exces(CyclicBarrier cyclicBarrier) {
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "暂定执行");
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("全部执行完成后显示");
        }
    }
}
