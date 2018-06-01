package com.hy.properties.javaconfigproperties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * java配置属性
 *
 * @author wyx
 */
@PropertySource("classpath:rabbitmq.properties")
@Configuration
@ComponentScan("com.hy.properties.javaconfigproperties")
public class JavaConfigProperties {
}
