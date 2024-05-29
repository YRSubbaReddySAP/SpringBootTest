package com.javaguides.springboot_firstapp.filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MyFilter_3 implements Filter {


    @Override
    @Order(2)
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
           System.out.println("Filter 3 is called");
           filterChain.doFilter(servletRequest,servletResponse);
    }
}
