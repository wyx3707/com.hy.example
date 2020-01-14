package com.hy.interceptor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义特性，为了在加入拦截器时做统一的ioc
 *
 * @author wyx
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterceptorAnnotation {
    String mapKey();
}
