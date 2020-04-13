package com.hy.spring.importtest.example3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 引入自定义的ImportBeanDefinitionRegistrar实现的类
 *
 * @author wyx
 */
@Import(MyImportBeanDefinitionRegistrar.class)
@Configuration
public class ImportImportBeanDefinitionRegistrarConfiguration {
}
