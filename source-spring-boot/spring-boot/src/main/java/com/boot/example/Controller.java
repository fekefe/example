package com.boot.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/22
 */
@RestController
public class Controller {
	
	@Value("${boot.name}")
	private String name;
	
	@RequestMapping("/")
	public String index() {
		return "Hello spring boot " + name;
	}
}
