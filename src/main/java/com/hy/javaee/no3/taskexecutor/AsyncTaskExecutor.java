package com.hy.javaee.no3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskExecutor {

    @Async
    public void execAsyncTask(int i) {
        System.out.println("===" + i);
    }

    @Async
    public void execAsyncTask1(int i) {
        System.out.println("----" + i);
    }
}
