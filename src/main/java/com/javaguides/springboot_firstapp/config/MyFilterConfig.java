package com.javaguides.springboot_firstapp.config;

import com.javaguides.springboot_firstapp.filter.MyNewFilter;
import jakarta.servlet.FilterRegistration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {
@Bean
public FilterRegistrationBean<MyNewFilter> registrationBean() {
    FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new MyNewFilter());

    return  registrationBean;
}

}

