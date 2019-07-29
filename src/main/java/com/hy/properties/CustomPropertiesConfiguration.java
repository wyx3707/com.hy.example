package com.hy.properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by WYX on 2017/7/24.
 */
public class CustomPropertiesConfiguration extends PropertyResourceConfigurer {

    private static Map<String, String> propMap = null;

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props) throws BeansException {
        System.out.println("--properties create begin--");
        propMap = new HashMap<>();
        Set<Object> objects = props.keySet();
        objects.forEach(item -> {
            String value = String.valueOf(props.get(item));
            propMap.put(item.toString(), value);
        });
    }

    public static String getProper(String proName) {
        return propMap.get(proName);
    }
}
