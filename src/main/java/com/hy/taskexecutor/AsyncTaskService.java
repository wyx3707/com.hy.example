package com.hy.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行" + i);
    }

    @Async
    public void executeAsyncTask1(Integer i) {
        System.out.println("执行(----)" + i);
    }
}
