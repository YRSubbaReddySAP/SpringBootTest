package com.javaguides.springboot_firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class springbootFirstappH2Application {

	public static void main(String[] args) {
		SpringApplication.run(springbootFirstappH2Application.class, args);
	}

}
