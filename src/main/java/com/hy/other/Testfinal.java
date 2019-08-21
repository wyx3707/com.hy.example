package com.hy.other;

import java.util.concurrent.*;

import static java.util.concurrent.Executors.*;

/**
 * 使用final 修饰变量，保证在以后的使用中不能被改变
 *
 * @author WYX
 * 下面的例子就说明了这个，
 * 使用spring.format ，是生成了一个新的字符串
 */
public class Testfinal {

    static final String ORDER_MATERIAL_USED_FILE_KEY_FORMAT = "material_field_%s_%s";

    public static void main(String[] args) {

        //下面会报错
        //ORDER_MATERIAL_USED_FILE_KEY_FORMAT="error";
        //String format = String.format(ORDER_MATERIAL_USED_FILE_KEY_FORMAT, "3", "4");
       // System.out.println(format);


        ExecutorService es = newFixedThreadPool(3);
        Future<Integer> submit = es.submit(new A());
        try {
            Integer integer = submit.get();
            System.out.println(integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class A implements Callable<Integer> {


    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        return 1000;
    }
}
