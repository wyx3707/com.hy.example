package com.hy.javaee.no1.aop;

import java.lang.annotation.*;

/**
 * 定义apo切点的特性
 *
 * @author wyx
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AspectAnnotation {
    String name();
}
