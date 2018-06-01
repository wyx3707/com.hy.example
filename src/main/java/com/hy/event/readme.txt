

  1、定义自己的一个事件类
    如：MyEvent类
  2、定义一个事件监听类
    如：MyEventLister
  3、把这个事件发布出去
    在test类的可看
  在这里发现一个有用的就是如果要用到spring 注解时，如果不加类似@Component和@Service这类注解时，如果不是在根目录下，则需要加在
  配置类中EventConfiguration中使用@ComponentScan("com.hy.bean.event")
这个定义扫描路径