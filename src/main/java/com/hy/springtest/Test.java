package com.hy.springtest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-01-15 19:14
 **/
@ContextConfiguration(locations = "classpath:BeanFactory.xml")
@RunWith(value = SpringJUnit4ClassRunner.class)
public class Test {

    @Resource
    SpringTestService springTestService;

    @org.junit.Test
    public void sgo(){
        springTestService.springTestService();
    }
}
