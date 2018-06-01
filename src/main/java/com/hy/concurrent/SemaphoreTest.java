package com.hy.concurrent;

import java.util.concurrent.Semaphore;

/**
 * Semaphore翻译成字面意思为 信号量，Semaphore可以控同时访问的线程个数，通过 acquire() 获取一个许可，如果没有就等待，而 release() 释放一个许可。
 * <p>
 * Semaphore类位于java.util.concurrent包下，它提供了2个构造器：
 * <p>
 * public Semaphore(int permits) {          //参数permits表示许可数目，即同时可以允许多少线程进行访问
 * sync = new NonfairSync(permits);
 * }
 * public Semaphore(int permits, boolean fair) {    //这个多了一个参数fair表示是否是公平的，即等待时间越久的越先获取许可
 * sync = (fair)? new FairSync(permits) : new NonfairSync(permits);
 * }
 * 下面说一下Semaphore类中比较重要的几个方法，首先是acquire()、release()方法：
 * <p>
 * public void acquire() throws InterruptedException {  }     //获取一个许可
 * public void acquire(int permits) throws InterruptedException { }    //获取permits个许可
 * public void release() { }          //释放一个许可
 * public void release(int permits) { }    //释放permits个许可
 * acquire()用来获取一个许可，若无许可能够获得，则会一直等待，直到获得许可。
 * <p>
 * release()用来释放许可。注意，在释放许可之前，必须先获获得许可。
 * <p>
 * 这4个方法都会被阻塞，如果想立即得到执行结果，可以使用下面几个方法：
 * <p>
 * public boolean tryAcquire() { };    //尝试获取一个许可，若获取成功，则立即返回true，若获取失败，则立即返回false
 * public boolean tryAcquire(long timeout, TimeUnit unit) throws InterruptedException { };  //尝试获取一个许可，若在指定的时间内获取成功，则立即返回true，否则则立即返回false
 * public boolean tryAcquire(int permits) { }; //尝试获取permits个许可，若获取成功，则立即返回true，若获取失败，则立即返回false
 * public boolean tryAcquire(int permits, long timeout, TimeUnit unit) throws InterruptedException { }; //尝试获取permits个许可，若在指定的时间内获取成功，则立即返回true，否则则立即返回false
 * 另外还可以通过availablePermits()方法得到可用的许可数目。
 */
public class SemaphoreTest {

    public static void main(String[] args) {
        Driver driver = new Driver();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        driver.println();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ;
            }.start();

        }
    }
}

class Driver {
    Semaphore semaphore = new Semaphore(3);

    public void println() throws InterruptedException {
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName()+"获取许可，开始执行");
        Thread.sleep(2000);
        semaphore.release();
    }


}

