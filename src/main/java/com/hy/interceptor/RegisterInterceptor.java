package com.hy.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by wyx on 2017/7/24.
 */
@Configuration
@ConditionalOnProperty(prefix = "hy.web", name = "enabled", matchIfMissing = true)
@EnableConfigurationProperties({InterceptorProperties.class})
public class RegisterInterceptor extends WebMvcConfigurerAdapter {

    @Autowired
    private InterceptorProperties interceptorProperties;
    //所有继承HandlerInterceptor的子类的集合
    @Autowired(required = false)
    private List<HandlerInterceptor> handlerInterceptorList;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if (handlerInterceptorList.isEmpty()) {
            return;
        }
        handlerInterceptorList.forEach(item -> {
            InterceptorAnnotation annotation = item.getClass().getAnnotation(InterceptorAnnotation.class);
            String mapKey = annotation.mapKey();
            InterceptorProperties.Path path = interceptorProperties.getMap().get(mapKey);
            registry.addInterceptor(item).addPathPatterns(path.getPathPattern()).excludePathPatterns(path.getExcludePathPatterns());
        });
        super.addInterceptors(registry);
    }
}
