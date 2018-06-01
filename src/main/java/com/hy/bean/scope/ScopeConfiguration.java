package com.hy.bean.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by wyx on 2017/8/1.
 */
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope(value = "prototype")
    public PrototypeService getPrototypeService() {
        return new PrototypeService();
    }

    @Bean
    public SingletonSerivce getSingletonSerivce() {
        return new SingletonSerivce();
    }
}
