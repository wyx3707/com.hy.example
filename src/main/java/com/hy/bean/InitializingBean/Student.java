package com.hy.bean.InitializingBean;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * InitializingBean 这个接口中的afterPropertiesSet方法是在bean的属性初始化完成后才会执行的一个方法
 * 可在这个方法中做一些其他处理，比如对属性修改，删除，等等
 */
@Data
public class Student implements InitializingBean {
    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        name = "我的名字叫" + name;
    }
}
