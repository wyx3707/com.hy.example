package com.hy.spring.importtest.example2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现ImportSelector的类
 *
 * @author wyx
 */
public class MyImportSelector implements ImportSelector {

    /**
     * 实现方法的返回值是字符串数组，也就是需要注入容器中的组件的全类名
     *
     * @param importingClassMetadata 当前配置类上的注解信息 在本例中是ImportSelectorConfiguration这个类
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        importingClassMetadata.getAnnotationTypes();
        return new String[]{Student.class.getName(), Teacher.class.getName()};
    }
}
