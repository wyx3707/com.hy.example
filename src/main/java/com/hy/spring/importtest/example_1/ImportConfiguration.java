package com.hy.spring.importtest.example_1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(Student.class)
@Configuration
public class ImportConfiguration {
}
