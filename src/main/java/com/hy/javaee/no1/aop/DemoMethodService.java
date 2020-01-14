package com.hy.javaee.no1.aop;

import org.springframework.stereotype.Service;

/**
 * 和DemoAnnotation同级，定义一个使用匹配表达式的测试类
 *
 * @author wyx
 */
@Service
public class DemoMethodService {
    /**
     * 是一个普通的方法
     */
    public void add() {
        System.out.println("exec com.hy.javaee.no1.aop.DemoMethodService.add");
    }
}
