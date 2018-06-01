package com.hy.comparable;

import lombok.Data;

/**
 * 自定义的排序示例
 * 如果需要做比较排序，则必须实现Comparable接口
 *
 * @author wyx
 */
@Data
public class Sort implements Comparable<Sort> {

    private String name;
    private Integer age;

    public Sort(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 排序规则： 按年龄来排序
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Sort o) {
        return this.age - o.getAge();
    }
}
