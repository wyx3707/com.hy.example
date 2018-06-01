package com.hy.Interceptor;

import com.hy.interceptor.InterceptorAnnotation;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wyx on 2017/7/13.
 */
@Component
@InterceptorAnnotation(mapKey = "appKey")
public class appKeyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String appKey = request.getParameter("appKey");
        if (StringUtils.isEmpty(appKey)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            response.getWriter().write("appKey有问题");
            return false;
        }
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
