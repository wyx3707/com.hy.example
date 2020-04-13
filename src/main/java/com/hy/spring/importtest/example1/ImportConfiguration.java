package com.hy.spring.importtest.example1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: demo
 * @description: Import：参数value接收一个Class数组，将你传入的类以全类名作为id加入IOC容器中
 * @author: wyx
 * @create: 2020-04-13 14:25
 **/
@Configuration
@Import(Student.class)
public class ImportConfiguration {
}
