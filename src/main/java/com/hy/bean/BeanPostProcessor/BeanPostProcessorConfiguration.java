package com.hy.bean.BeanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hy.bean.BeanPostProcessor")
public class BeanPostProcessorConfiguration {

    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public Teather teather() {
        return new Teather();
    }
}
