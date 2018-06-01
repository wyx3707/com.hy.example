package com.hy.interceptor;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wyx on 2017/7/25.
 */
@Component
@ConfigurationProperties(prefix = "hy.web")
@Data
public class InterceptorProperties {
    private Map<String, Path> map = new HashMap<>();

    @Data
    public static class Path {
        private String pathPattern;
        private String[] excludePathPatterns;

    }
}
