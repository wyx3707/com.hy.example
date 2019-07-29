package com.hy.bean.initanddestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by WYX on 2017/8/1.
 *
 * @author WYX
 */
@Configuration
public class InitConfiguration {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitService getInitService() {
        return new InitService();

    }

}
