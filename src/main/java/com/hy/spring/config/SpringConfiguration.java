package com.hy.spring.config;

import com.hy.spring.bean.Color;
import com.hy.spring.importbean.BlueBean;
import com.hy.spring.importbean.ImportSelectorImpl;
import com.hy.spring.importbean.YellowBean;
import org.springframework.context.annotation.*;

/**
 * @ComponentScan value: 指定要扫描的包
 * @ClassName SpringConfiguration
 * @Desc excludeFilters:剔除掉不扫描的组件
 * @Author wyx
 * @Date 2018/5/7 16:26
 * @Version 1.0
 */
@Configuration
//@ComponentScan(value = "com.hy.spring",        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Service.class)})
@ComponentScan(value = "com.hy.spring")
@Import(value = {YellowBean.class, BlueBean.class, ImportSelectorImpl.class})
public class SpringConfiguration {

    /**
     * 定义一个bean，如果没有设置bean的名字的话，默认使用方法名做为bean的名称
     */
    @Bean(value = "color")
    public Color getColor() {
        Color color = new Color();
        color.setName("red");
        return color;
    }
}
