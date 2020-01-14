package com.hy.javaee.no2.applicationevent;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 定义事件发布类，可以类比，懂，controller中其他service中都可以
 *
 * @author wyx
 */
@Component
public class DemoPublish {

    @Resource
    private ApplicationContext applicationContext;

    public void publish() {
        applicationContext.publishEvent(new DemoEvent(this, "dog"));

    }

}
