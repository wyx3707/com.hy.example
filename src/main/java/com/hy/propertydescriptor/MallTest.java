package com.hy.propertydescriptor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

/**
 * 具有相同属性的不同的类，如果获取相同的属性的时候，可能采用这种方法
 */
public class MallTest {
    public static void main(String[] args) throws IllegalAccessException, IntrospectionException, InvocationTargetException {
        MallClass mallClass = new MallClass();
        mallClass.setMallName("水产");
        mallClass.setMallPrice(new BigDecimal(125));


        StudentClass studentClass = new StudentClass();
        studentClass.setMallPrice(new BigDecimal(100));
        studentClass.setMallName("时百");

        getPropertor("mallName", mallClass);
        getPropertor("mallPrice", mallClass);
        getPropertor("mallName", studentClass);
        getPropertor("mallPrice", studentClass);


    }

    public static void getPropertor(String propertyName, Object o) throws IntrospectionException, InvocationTargetException, IllegalAccessException {

        PropertyDescriptor propertyDescriptor = new PropertyDescriptor(propertyName, o.getClass());
        Method readMethod = propertyDescriptor.getReadMethod();
        Object invoke = readMethod.invoke(o);
        System.out.println(invoke);

    }
}
