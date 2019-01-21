package com.boot.example.controller;

import com.boot.example.configuration.HelloService;
import com.boot.example.bean.ConfigBean1;
import com.boot.example.bean.ConfigBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/7
 */
@RestController
public class HelloController {
	
	@Autowired
	ConfigBean1 bean1;
	@Autowired
	ConfigBean2 bean2;
	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	public String index() {
		// 读取通过配置文件，通过bean的形式获取
		System.out.println(bean1.getAge());
		System.out.println(bean2.getAge());
		return "Hello spring boot";
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return helloService.sayHello();
	}
	
	
}
