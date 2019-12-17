package com.hy.designpattern.strategy;

import lombok.Setter;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2019-12-17 14:33
 **/
@Setter
public class DuckSak {

    /**
     * 聚合到使用类中
     */
    private AbstractDuck abstractDuck;

    public void say() {
        if (null == abstractDuck) {
            return;
        }
        abstractDuck.run();
    }
}
