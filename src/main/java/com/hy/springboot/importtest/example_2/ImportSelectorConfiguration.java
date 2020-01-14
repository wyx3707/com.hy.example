package com.hy.springboot.importtest.example_2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(MyImportSelector.class)
@Configuration
public class ImportSelectorConfiguration {
}
