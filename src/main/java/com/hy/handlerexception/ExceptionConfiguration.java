package com.hy.handlerexception;

import org.springframework.stereotype.Component;

/**
 * Created by wyx on 2017/7/25.
 */
@Component
public class ExceptionConfiguration {

    public MyCustomException exception() {
        return new MyCustomException();
    }
}
