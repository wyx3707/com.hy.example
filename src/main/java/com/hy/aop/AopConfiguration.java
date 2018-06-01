package com.hy.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 配置类
 *
 * @author wyx
 * @EnableAspectJAutoProxy 注释允许在使用目标对象前生成代理对象
 */
@ComponentScan("com.hy.aop")
@Configuration
@EnableAspectJAutoProxy
public class AopConfiguration {
}
