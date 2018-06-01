package com.hy.java8;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.*;

public class ScheduleThreadPoolTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = newScheduledThreadPool(7);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("ppp");
            }
        },30, TimeUnit.SECONDS);
    }
}
