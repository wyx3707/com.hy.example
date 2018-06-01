package com.hy.javaEE.NO2.applicationevet;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class DemoPulish {

    @Resource
    private ApplicationContext applicationContext;

    public void publish() {
        applicationContext.publishEvent(new DemoEvent(this, "dog"));

    }

}
