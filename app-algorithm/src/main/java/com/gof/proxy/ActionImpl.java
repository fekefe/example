package com.gof.proxy;

/**
 * 这个是没有实现接口的实现类
 * @author student
 */
public class ActionImpl {
	
	private String msg;
	
	public void addBook() {
		System.out.println("增加图书的普通方法...");
	}
	
	public String delBook() {
		System.out.println("删除图书的普通方法...");
		return "del";
	}
	
	public void set(String msg) {
		this.msg = msg;
	}
	
	public String get1() {
		System.out.println("get...");
		return msg;
	}
}
