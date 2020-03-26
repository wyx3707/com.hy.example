package com.hy.spring.lifecyclic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.annotation.Annotation;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-20 09:23
 **/
public class BeanListenerPostProcessor implements BeanPostProcessor, BeanFactoryAware {

    private BeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        if (!(beanFactory instanceof ConfigurableListableBeanFactory)) {
            throw new IllegalArgumentException(
                    "DefaultLifecycleProcessor requires a ConfigurableListableBeanFactory: " + beanFactory);
        }
        this.beanFactory = beanFactory;
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        Class<?> aClass = o.getClass();
        Annotation[] annotations = aClass.getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            if ((annotations[i].annotationType() == Bind.class)) {
                String value = ((Bind) (annotations[i])).value();
                String beanName = ((Bind) (annotations[i])).beanName();
                Bean bean = new Bean();
                bean.setName(value);
                ((ConfigurableBeanFactory) beanFactory).registerSingleton(beanName, bean);
            }
        }
        return o;
    }
}
