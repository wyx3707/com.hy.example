package com.hy.properties.javaconfigproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JavaConfigPropertiesService {

    @Value("${rabbitmq.username}")
    private String username;

    public void showProperties() {
        System.out.println(username);
    }

}
