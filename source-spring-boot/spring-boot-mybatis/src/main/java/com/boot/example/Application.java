package com.boot.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/17
 */
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) throws Exception {
		// SpringApplication.run(Application.class, args);
		
		new SpringApplicationBuilder(Application.class).web(true).run(args);

	}
	
}
