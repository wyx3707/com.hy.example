package com.hy.spring.initbean.example2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * 实现初始化接口与销毁接口
 *
 * @ClassName InitBean2
 * @Desc TODO
 * @Author WYX
 * @Date 2018/5/8 12:29
 * @Version 1.0
 */
public class InitBean2 implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("InitBean2 destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitBean2 afterPropertiesSet");
    }
}
