package com.hy.spring.aware.applicationeventpublisheraware;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 15:44
 **/
@Data
public class MyPublishEvent extends ApplicationEvent {

    private Integer age;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyPublishEvent(Object source, Integer age) {
        super(source);
        this.age = age;
    }


}
