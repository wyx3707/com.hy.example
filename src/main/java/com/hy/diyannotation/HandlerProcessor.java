package com.hy.diyannotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component
public class HandlerProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        Map<String, Object> beansWithAnnotation = configurableListableBeanFactory.getBeansWithAnnotation(Type.class);
        System.out.println("beansWithAnnotation" + beansWithAnnotation.size());

        Iterator<Map.Entry<String, Object>> iterator = beansWithAnnotation.entrySet().iterator();
        Map<String, Class> map = new HashMap<>();

        while (iterator.hasNext()) {
            Class<?> aClass = iterator.next().getValue().getClass();
            String value = aClass.getAnnotation(Type.class).value();
            map.put(value, aClass);
        }
        HandlerConext hc = new HandlerConext(map);
        configurableListableBeanFactory.registerSingleton("hc", hc);

    }
}
