package com.hy.properties;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WYX on 2017/7/25.
 */
@RestController
public class PropertiesController {

    @RequestMapping("proper/get")
    public String getProperties() {
        String proper = CustomPropertiesConfiguration.getProper("student");
        return proper;
    }
}
