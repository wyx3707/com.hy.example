package com.hy.spring.lifecyclic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-20 09:11
 **/
@Configuration
@ComponentScan(value = "com.hy.spring.lifecyclic")
public class CycliConfiguration {

    @Bean
    public BeanListenerPostProcessor beanListenerPostProcessor() {
        return new BeanListenerPostProcessor();
    }
}
