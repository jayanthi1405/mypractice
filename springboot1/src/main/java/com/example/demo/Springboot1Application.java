package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.developerstack")
@SpringBootApplication
public class Springboot1Application extends SpringBootServletInitializer {
	
	 private static Class applicationClass = Springboot1Application.class;

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }

}