package com.hy.springboot.importtest.example_1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(Student.class)
@Configuration
public class ImportConfiguration {
}
