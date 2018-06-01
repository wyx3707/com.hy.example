package com.hy.javaEE.NO2.applicationevet;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {

    private String so;

    public DemoEvent(Object source, String so) {
        super(source);
        this.so = so;
    }
}
