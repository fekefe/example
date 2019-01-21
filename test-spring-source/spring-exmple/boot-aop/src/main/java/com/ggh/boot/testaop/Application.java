package com.ggh.boot.testaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import javax.annotation.PostConstruct;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.core.env.Environment;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class Application {
	
	// @Autowired
	// Environment mEnvironment;
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	private void init() {
	
	}
	
}
