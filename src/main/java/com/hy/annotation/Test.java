package com.hy.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 这个例子是以一个类的注解的方式组合向数据库插入的时的语句的示例
 * 主要是对注解的应用
 *
 * @author wyx
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            String sql = createSql();
            System.out.println(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String createSql() throws Exception {
        //加载某个类的全类名
        Class<?> aClass = Class.forName("com.hy.annotation.Student");
        //获取这个类的DBTable注解定义
        DBTable dbTable = aClass.getAnnotation(DBTable.class);
        if (null == dbTable) {
            return "";
        }
        List<String> stringArrayList = new ArrayList<>();
        //表名
        String tableName = dbTable.value();
        //获取类上全部属性列表
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            //获取这个属性上的全部的注解列表
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            for (Annotation annotation : declaredAnnotations) {
                //判断
                if (annotation instanceof SQLInteger) {
                    SQLInteger sqlInteger = (SQLInteger) annotation;
                    //字段名
                    String fieldName = sqlInteger.name();
                    //字段约束
                    Constraints constraints = sqlInteger.constraints();
                    String constraints1 = createConstraints(constraints);
                    stringArrayList.add(fieldName + " INT " + constraints1);
                }
                //判断
                if (annotation instanceof SQLString) {
                    SQLString sqlString = (SQLString) annotation;
                    //字段名
                    String fieldName = sqlString.name();
                    int length = sqlString.length();
                    //字段约束
                    Constraints constraints = sqlString.constraints();
                    String constraints1 = createConstraints(constraints);
                    stringArrayList.add(fieldName + " VARCHAR(" + length + ") " + constraints1);
                }
            }
        }
        String result = "CREATE TABEL " + tableName + " (";
        for (String str : stringArrayList) {
            result += str + ",";
        }
        result = result.substring(
                0, result.length() - 1) + ");";
        return result;
    }

    private static String createConstraints(Constraints constraints) {
        String constraintStr = "";
        if (null == constraints) {
            return constraintStr;
        }
        if (constraints.primaryKey()) {
            constraintStr += " PRIMARY KEY ";
        }
        if (!constraints.allowNull()) {
            constraintStr += " NOT NULL ";
        }
        return constraintStr;
    }
}
