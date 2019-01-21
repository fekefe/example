package com.boot.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 读取指定配置文件
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/7
 */
@Component
@ConfigurationProperties(prefix = "author2")
@PropertySource("classpath:config/author.properties")
public class ConfigBean2 {
	private String name;
	private Long age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Long getAge() {
		return age;
	}
	
	public void setAge(Long age) {
		this.age = age;
	}
}
