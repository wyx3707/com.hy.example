package com.hy.annotation;

/**
 * 要操作的数据库表对应的实体类
 *
 * @author wyx
 */
@DBTable("STUDENT")
public class Student {
    @SQLInteger(name = "ID", constraints = @Constraints(primaryKey = true, allowNull = false))
    private Integer id;

    @SQLString(name = "STUDENT_NAME", length = 200, constraints = @Constraints(allowNull = false))
    private String Name;

    @SQLInteger(name = "AGE")
    private Integer age;
}
