package com.hy.interceptor;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by wyx on 2017/7/25.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface InterceptorAnnotation {
    String mapKey();
}
