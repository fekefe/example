package com.boot.example.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/8
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
	private static final String MSG = "world";
	private String msg = MSG;
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
