package com.hy.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 加载类路径下的xml文件
 *
 * @author wyx
 */
@Configuration
@ImportResource(locations = "classpath:**/*.xml")
@ComponentScan("com.hy.configuration")
public class PropertiesConfiguration {
}
