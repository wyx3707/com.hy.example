package com.hy.spring.initbean.example2;

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
