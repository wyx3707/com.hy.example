package com.hy.callable;

import lombok.Value;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-03-17 14:06
 **/
@Value(staticConstructor = "con")
public class MyCallableDTO {
    private String name;
}
