package com.hy.spring.aware.applicationeventpublisheraware;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 16:07
 **/
@Component
public class MyPublishEventListener {

    @EventListener
    public void listener(MyPublishEvent myPublishEvent) {
        System.out.println(myPublishEvent.getAge());
    }
}
