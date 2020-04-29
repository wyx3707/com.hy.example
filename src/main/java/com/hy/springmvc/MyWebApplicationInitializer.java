package com.hy.springmvc;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @program: demo
 * @description:
 * @author: wyx
 * @create: 2020-04-17 13:15
 **/
public class MyWebApplicationInitializer implements WebApplicationInitializer {
    /**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain WebApplicationInitializer above}.
     *
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     *                          throws a {@code ServletException}
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

    }
}
