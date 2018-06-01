package com.hy.spring.initbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName config
 * @Desc TODO
 * @Author wyx
 * @Date 2018/5/8 12:26
 * @Version 1.0
 */
@Configuration
public class Config {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public InitBean initBean() {
        return new InitBean();
    }

    @Bean()
    public InitBean2 initBean2() {
        return new InitBean2();
    }
}
