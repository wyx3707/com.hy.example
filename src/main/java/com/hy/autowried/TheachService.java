package com.hy.autowried;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-01-15 18:56
 **/
@Service
public class TheachService {

    /**
     * @param bookService
     * @Resource 或@Autowired 标注的方法，会在ioc容器创建时，就会将方法的参数的bean自动装配到方法上了
     */
    @Resource
    // @Autowired
    public void gos(BookService bookService) {
        System.out.println("==========com.hy.autowried.BookService " + bookService);
    }
}
