package com.hy.properties.javaconfigproperties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 此例子是以javaconfig方式读取自动义的属性文件值的
 *
 * @author WYX
 */
public class JavaConfigPropertiesTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfigProperties.class);
        JavaConfigPropertiesService bean = annotationConfigApplicationContext.getBean(JavaConfigPropertiesService.class);
        bean.showProperties();
    }
}
