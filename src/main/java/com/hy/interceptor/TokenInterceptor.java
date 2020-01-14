package com.hy.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * token拦截器，功能是对请求是的入参是否存在token入参的判断
 * 这里是继承了HandlerInterceptorAdapter 类,而AppKeyInterceptor是实现了HandlerInterceptor接口,功能上是一样的
 *
 * @author wyx
 */
@Component
@InterceptorAnnotation(mapKey = "token")
public class TokenInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            response.getWriter().write("token有问题");
            return false;
        }
        return true;
    }

}
