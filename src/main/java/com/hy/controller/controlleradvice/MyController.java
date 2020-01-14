package com.hy.controller.controlleradvice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-01-14 10:03
 **/
@RestController
public class MyController {

    @RequestMapping("/null")
    public String nullExceptionController() {
        String s = null;
        s.toUpperCase();
        return "";
    }
}
