package com.hy.event;

import org.springframework.context.ApplicationEvent;

/**
 * 我的事件定义
 * Created by wyx on 2017/8/1.
 */
public class MyEvent extends ApplicationEvent {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     *
     * @param source 上下文
     * @param msg
     */
    public MyEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
}
