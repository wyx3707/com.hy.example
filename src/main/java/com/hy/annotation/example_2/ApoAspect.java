package com.hy.annotation.example_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@Aspect
@Component
public class ApoAspect implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    @Pointcut("@annotation(com.hy.annotation.example_2.GetListAnn)")
    public void aspect() {
    }


    @Around("aspect()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object proceed = proceedingJoinPoint.proceed();
        List list = (List) proceed;
        if (!CollectionUtils.isEmpty(list)) {
            for (int i = 0; i < list.size(); i++) {
                Object student = list.get(i);

                Field[] declaredFields = student.getClass().getDeclaredFields();
                for (Field field : declaredFields) {
                    SetValue setValue = field.getAnnotation(SetValue.class);
                    if (null != setValue) {
                        Class<?> studentServiceClassz = setValue.classz();
                        Object studentService = applicationContext.getBean(studentServiceClassz);


                        String id = setValue.getValue();
                        Method getIdMethod = student.getClass().getMethod("get" + id.substring(0, 1).toUpperCase() + id.substring(1));
                        //获取到id
                        Object paramId = getIdMethod.invoke(student);

                        //调用StudentService.find方法
                        Method findMethod = studentServiceClassz.getMethod(setValue.methodName(), student.getClass().getDeclaredField(id).getType());
                        String getName = (String) findMethod.invoke(studentService, paramId);


                        String name = setValue.setValue();
                        Method setNameMethod = student.getClass().getMethod("set" + name.substring(0, 1).toUpperCase() + name.substring(1), student.getClass().getDeclaredField(name).getType());
                        setNameMethod.invoke(student, getName);
                    }
                }
            }
        }
        return proceed;
    }


    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
