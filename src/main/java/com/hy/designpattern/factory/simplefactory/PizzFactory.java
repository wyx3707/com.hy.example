package com.hy.designpattern.factory.simplefactory;

/**
 * 披萨的创建工厂
 *
 * @author wyx
 */
public class PizzFactory {

    Pizz pizz;

    /**
     * 获取一个披萨实例
     *
     * @param size
     * @return
     */
    public Pizz getPizz(String size) {
        if ("big".equals(size)) {
            pizz = new BigPizz();
            return pizz;
        } else if ("mini".equals(size)) {
            pizz = new MiniPizz();
            return pizz;
        }
        return null;
    }
}
