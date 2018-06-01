package com.hy.java8.thead_runnable.thread;


class MyThread extends Thread {

    private int count = 5;

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

public class TestThread {

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }


}
