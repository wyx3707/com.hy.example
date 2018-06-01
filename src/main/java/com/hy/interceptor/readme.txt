spring 拦截器

1、在application.properties
   中配置相关的拦截目录和剔除目录
   如：hy.web.map.token.pathPattern=/**
       hy.web.map.token.excludePathPatterns[0]=/index
2、自定义自己的注解
   IntercepterAnntation

3、自定义自己的拦截器处理逻辑 如appKeyInterceptor和tokenInterceptor
   在上面使用上面定义的注解

4、注册自定义的拦截器在RegisterInterceptor
   使用反射查找有IntercepterAnntation的类，将它加到注册器中

5、hy.web.map.token.pathPattern=/**  中的map 对应InterceptorProperties中的map属性，它之后会做为一个map在注册时用