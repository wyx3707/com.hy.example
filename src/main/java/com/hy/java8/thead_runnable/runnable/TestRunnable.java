package com.hy.java8.thead_runnable.runnable;


class MyThread1 implements Runnable{

    private int count=5;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (count > 0) {
                String name = Thread.currentThread().getName();
                System.out.println("我在打印" + name);
                count--;
            }
        }
    }
}

public class TestRunnable {

    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        MyThread1 myThread2=new MyThread1();
        new Thread(myThread1).start();
        new Thread(myThread2).start();

    }

}
