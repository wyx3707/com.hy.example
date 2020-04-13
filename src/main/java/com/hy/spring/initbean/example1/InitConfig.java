package com.hy.spring.initbean.example1;

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
public class InitConfig {

    /**
     * 配置这个bean的出事化和销毁的方法
     *
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitBean initBean() {
        return new InitBean();
    }

}
