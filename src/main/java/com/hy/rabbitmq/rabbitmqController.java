package com.hy.rabbitmq;

import com.rabbitmq.client.ConnectionFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class rabbitmqController {
    @RequestMapping("/rabbit")
    public String rabbit(){
       return"";
    }
}
