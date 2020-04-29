package com.hy.spring.aware.beanclassloaderaware;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-14 16:13
 **/
@Component
public class MyBeanClassLoaderAware implements BeanClassLoaderAware {

    private ClassLoader classLoader;

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    public void aVoid(){
        ClassLoader parent = classLoader.getParent();

    }
}
