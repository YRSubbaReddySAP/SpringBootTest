package com.javaguides.springboot_firstapp.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MyFilter_2 implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
           System.out.println("Filter 2 is called");
           filterChain.doFilter(servletRequest,servletResponse);
    }
}
