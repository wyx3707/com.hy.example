package com.hy.spring.initbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName InitBean2
 * @Desc TODO
 * @Author WYX
 * @Date 2018/5/8 12:29
 * @Version 1.0
 */
public class InitBean2 implements InitializingBean,DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("InitBean2 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitBean2 afterPropertiesSet");
    }
}
