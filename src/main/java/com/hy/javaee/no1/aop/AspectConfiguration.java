package com.hy.javaee.no1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 切面的配置类
 *
 * @author wyx
 */
@Configuration
@ComponentScan("com.hy.javaee.no1.aop")
@EnableAspectJAutoProxy
public class AspectConfiguration {
}
