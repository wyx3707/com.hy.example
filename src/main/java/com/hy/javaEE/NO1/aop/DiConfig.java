package com.hy.javaEE.NO1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hy.javaEE.classNo1.aop")
@EnableAspectJAutoProxy
public class DiConfig {
}
