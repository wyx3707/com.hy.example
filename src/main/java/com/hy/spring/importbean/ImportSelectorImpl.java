package com.hy.spring.importbean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义导入组件
 *
 * @ClassName ImportSelectorImpl
 * @Desc TODO
 * @Author wyx
 * @Date 2018/5/8 11:44
 * @Version 1.0
 */
public class ImportSelectorImpl implements ImportSelector {
    /**
     * 返回值就是要注入到容器的组件
     *
     * @param importingClassMetadata :当前类的所有的注解信息
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.hy.spring.importbean.ReaBean"};
    }
}
