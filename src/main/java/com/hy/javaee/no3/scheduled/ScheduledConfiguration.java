package com.hy.javaee.no3.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 定义定时作业的配置类
 *
 * @author wyx
 */
@Configuration
@EnableScheduling
@ComponentScan("com.hy.javaee.no3.scheduled")
public class ScheduledConfiguration {
}
