package com.hy.javaee.no2.applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义事件监听类，并加入到spring容器中
 *
 * @author wyx
 */
@Component
public class DemoEventListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println("exec com.hy.javaee.no2.applicationevent.DemoEvent.word " + demoEvent.getWord());
        try {
            //在这里设置5秒的暂留， 是为了验证事件的执行过程和主线程是线性的，也就是必须等到事件执行完后，主线程才能继续执行
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
