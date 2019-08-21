package com.hy.taskexecutor;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.*;
import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 *
 */
public class ThreadPoolExceutorTest {
    public static void main(String[] args) {
//        ExecutorService executorService = newFixedThreadPool(1);
       Runnable runnable = () -> System.out.println("as");
//        FutureTask futureTask = new FutureTask(runnable, null);
//        executorService.submit(futureTask);

        ScheduledExecutorService scheduledExecutorService = newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(runnable,0,2000,TimeUnit.MILLISECONDS);
    }
}
