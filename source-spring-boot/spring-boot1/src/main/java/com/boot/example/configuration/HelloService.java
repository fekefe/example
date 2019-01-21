package com.boot.example.configuration;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/8
 */
public class HelloService {
	
	private String msg;
	
	public String sayHello() {
		return "hello" + msg;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
