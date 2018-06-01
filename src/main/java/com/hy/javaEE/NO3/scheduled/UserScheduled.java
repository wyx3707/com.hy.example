package com.hy.javaEE.NO3.scheduled;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class UserScheduled {

    @Scheduled(cron = "0/5 * *  * * ? ")
    public void exec(){
        System.out.println("66");

    }
}
