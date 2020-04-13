package com.hy.spring.importtest.example2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ImportSelector强调的是复用性，使用它需要创建一个类实现ImportSelector接口，实现方法的返回值是字符串数组，也就是需要注入容器中的组件的全类名。id同样也是全类名
 *
 * @author wyx
 */
@Import(MyImportSelector.class)
@Configuration
public class ImportSelectorConfiguration {
}
