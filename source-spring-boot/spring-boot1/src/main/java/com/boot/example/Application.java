package com.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/4/26
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.boot")
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
}
