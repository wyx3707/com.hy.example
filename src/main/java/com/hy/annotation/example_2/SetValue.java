package com.hy.annotation.example_2;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SetValue {

    Class<?> classz();

    String methodName() default "";

    String getValue() default "";

    String setValue() default "";

}
