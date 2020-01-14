package com.hy.javaee.no3.scheduled;

import com.hy.collection.DateUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 作业类
 *
 * @author wyx
 */
@Component
public class UserScheduled {

    /**
     * 定义每隔5秒就会执行的方法
     */
    @Scheduled(cron = "0/5 * *  * * ? ")
    public void exec() {
        System.out.println(DateUtils.getFormatDate(new Date(), "YYYY-MM-DD HH:mm:ss") + " exec com.hy.javaee.no3.scheduled.UserScheduled.exec");
    }
}
