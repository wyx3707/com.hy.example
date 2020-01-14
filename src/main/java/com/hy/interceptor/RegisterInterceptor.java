package com.hy.interceptor;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;
import java.util.List;

/**
 * 向spring 容器中加入拦截器
 *
 * @author wyx
 */
@Configuration
@ConditionalOnProperty(prefix = "hy.web", name = "enabled", matchIfMissing = true)
@EnableConfigurationProperties({InterceptorProperties.class})
public class RegisterInterceptor extends WebMvcConfigurerAdapter {

    @Resource
    private InterceptorProperties interceptorProperties;
    /**
     * 所有继承HandlerInterceptor的子类的集合
     */
    @Resource
    private List<HandlerInterceptor> handlerInterceptorList;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        if (handlerInterceptorList.isEmpty()) {
            return;
        }
        handlerInterceptorList.forEach(handlerInterceptor -> {
            InterceptorAnnotation annotation = handlerInterceptor.getClass().getAnnotation(InterceptorAnnotation.class);
            String mapKey = annotation.mapKey();
            InterceptorProperties.Path path = interceptorProperties.getInterceptors().get(mapKey);
            registry.addInterceptor(handlerInterceptor).addPathPatterns(path.getPathPattern()).excludePathPatterns(path.getExcludePathPatterns());
        });
        super.addInterceptors(registry);
    }
}
