package com.hy.javaEE.NO3.taskexecutor;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserTaskExecutor {

    @Autowired
    private ThreadPoolTaskExecutor taskExecutor;

    public void use() {
        for (int j = 0; j < 10; j++) {
            taskExecutor.execute(() -> {
                System.out.println(DateFormatUtils.format(new Date(), "yyyyMMddHHmmss"));
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
