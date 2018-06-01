package com.hy.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by wyx on 2017/8/1.
 */
@Component
public class MyEventLister implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        String msg = event.getMsg();
        System.out.println("我监听到了" + msg);
    }
}
