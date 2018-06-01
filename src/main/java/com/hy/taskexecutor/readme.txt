第一种方式：
      就是TaskConfiguration中的声明一个bean，则在其他地方使用


第二种方式：
     1、创建一个自定义类，实现AsyncConfigurer接口，在getAsyncExecutor()方法中定义ThreadPoolTaskExecutor

     2、在需要异步处理的方法上@Async注解， 则这个方法就是一个异步方法了
