package com.hy.lamda;

/**
 * 函数式接口示例
 */
@FunctionalInterface
interface Image {
    /**
     * 唯一的一个方法
     */
    void print();
}

public class Test {
    public static void main(String[] args) {
        Image w = new Image() {
            @Override
            public void print() {
                System.out.println("狗屎");
            }
        };
        fun(w);
    }

    public static void fun(Image image) {
        image.print();
    }

}
