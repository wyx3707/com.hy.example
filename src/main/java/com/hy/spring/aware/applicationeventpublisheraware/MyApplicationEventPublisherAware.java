package com.hy.spring.aware.applicationeventpublisheraware;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 15:37
 **/
@Component
public class MyApplicationEventPublisherAware implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;
    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     * @param applicationEventPublisher event publisher to be used by this object
     */
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }

    public void send(){
        MyPublishEvent myPublishEvent=new MyPublishEvent(this,3);
        applicationEventPublisher.publishEvent(myPublishEvent);
    }
}
