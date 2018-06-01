package com.hy.properties;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by wyx on 2017/7/27.
 */
@Configuration
public class PropertiesResourceConfiguration {

    @Bean
    public CustomPropertiesConfiguration customPropertiesConfiguration() {
        CustomPropertiesConfiguration customPropertiesConfiguration = new CustomPropertiesConfiguration();
        Resource resource = new ClassPathResource("application.properties");

        customPropertiesConfiguration.setLocation(resource);
        return customPropertiesConfiguration;
    }
}
