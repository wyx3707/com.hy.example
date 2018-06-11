package com.hy.event;

import org.springframework.context.ApplicationEvent;

/**
 * 实现ApplicationEvent 说明这是一个事件类
 *
 * @author wyx
 */
public class MyEvent extends ApplicationEvent {
    private String msg;

    public String getMsg() {
        return msg;
    }

    /**
     * @param source 上下文
     * @param msg
     */
    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
