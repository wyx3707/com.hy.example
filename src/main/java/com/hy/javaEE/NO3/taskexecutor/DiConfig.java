package com.hy.javaEE.NO3.taskexecutor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan("com.hy.javaEE.NO3.taskexecutor")
@EnableAsync
public class DiConfig {
}
