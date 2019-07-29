package com.hy.bean.InitializingBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitializingBeanConfiguration {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setName("abc");
        return student;
    }
}
