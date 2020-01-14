package com.hy.interceptor;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 拦截器的属性配置文件，主要是配置拦截路径和非拦截路径
 *
 * @author wyx
 */
@Component
@ConfigurationProperties(prefix = "hy.web")
@Data
public class InterceptorProperties {
    /**
     * 这个定义名一定要和application.properties文件中的定义的一致
     */
    private Map<String, Path> interceptors = new HashMap<>();

    @Data
    public static class Path {
        private String pathPattern;
        private String[] excludePathPatterns;

    }
}
