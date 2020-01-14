package com.hy.javaee.no2.applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件类
 *
 * @author wyx
 */
public class DemoEvent extends ApplicationEvent {

    /**
     * 定义事件类的属性
     */
    private String word;

    public String getWord() {
        return word;
    }

    public void saySomeThing() {
        System.out.println("exec com.hy.javaee.no2.applicationevent.DemoEvent.saySomeThing say" + word);
    }

    public DemoEvent(Object source, String word) {
        super(source);
        this.word = word;
    }
}
