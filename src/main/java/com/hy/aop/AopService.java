package com.hy.aop;

import org.springframework.stereotype.Service;

/**
 * @author WYX
 */
@Service
public class AopService {

    /**
     * 定义的实际的方法
     */
    @AopAnn
    public int run(int j, int i) {
        System.out.println("我是实际的方法开始执行");
        return j + i;
    }


    public void say() {
        System.out.println("我是com.hy.aop.AopService的say方法");
    }

}
