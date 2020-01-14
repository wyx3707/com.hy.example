package com.hy.controller.controlleradvice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-01-14 09:58
 **/
@ControllerAdvice
public class MyGlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ModelAndView nullException(){
        System.out.println("begin tansfer java.lang.NullPointerException");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/");
        return modelAndView;
    }

}
