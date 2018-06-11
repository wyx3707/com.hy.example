package com.hy.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 实现ApplicationListener接口，表明是一个事件的监听类
 * 泛型的定义指定要监听的类
 * 要加入到ioc窗口中@Component:接受spring 容器管理
 *
 * @author wyx
 */
@Component
public class MyEventLister implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        String msg = event.getMsg();
        System.out.println("我监听到了" + msg);
    }
}
