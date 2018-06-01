package com.hy.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Student {
    int count = 0;


    public void sayHi() {

        Lock reentrantLock = new ReentrantLock();
        reentrantLock.lock();
        try {
            count++;
            System.out.println("i" + count);
        } finally {
            reentrantLock.unlock();
        }
    }

}

public class ReentrantLockTest {

    public static void main(String[] args) {

    }
}
