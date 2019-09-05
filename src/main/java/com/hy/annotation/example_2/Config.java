package com.hy.annotation.example_2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hy.annotation.example_2")
@EnableAspectJAutoProxy
public class Config {
}
