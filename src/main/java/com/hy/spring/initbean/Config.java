package com.hy.spring.initbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName config
 * @Desc TODO
 * @Author WYX
 * @Date 2018/5/8 12:26
 * @Version 1.0
 */
@Configuration
public class Config {

    /**
     * 方法一：
     * 在类上有多个方法 ，可定义初始方法和销毁方法
     *
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitBean initBean() {
        return new InitBean();
    }

    /**
     * 方法二：
     * 这个是让这个类实现 初始接口和销毁接口
     *
     * @return
     */
    @Bean()
    public InitBean2 initBean2() {
        return new InitBean2();
    }
}
