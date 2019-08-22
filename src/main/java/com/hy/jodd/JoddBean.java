package com.hy.jodd;

import jodd.bean.BeanUtil;
import lombok.Data;

/**
 * 这个类是测试使用jodd-bean jar的工具
 *
 * @author wyx
 */
public class JoddBean {
    public static void main(String[] args) {
        Case ca = new Case();
        ca.setName("劳而无功");
        String name = BeanUtil.pojo.getProperty(ca, "name").toString();
        System.out.println(name);

        Class<?> name1 = BeanUtil.declared.getPropertyType(ca, "age");
        Class<?> name2 = BeanUtil.declared.getPropertyType(ca, "name");
        System.out.println(name1.getClass());
        System.out.println(name2.getClass());

    }

    @Data
    static class Case {

        private String name;
        private Integer age;
    }
}
