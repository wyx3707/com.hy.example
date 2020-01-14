package com.hy.springboot.importtest.example_3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyImportBeanDefinitionRegistrar.class)
@Configuration
public class ImportImportBeanDefinitionRegistrarConfiguration {
}
