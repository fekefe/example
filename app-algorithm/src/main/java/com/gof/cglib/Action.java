package com.gof.cglib;

/**
 * 这个是没有实现接口的实现类
 * @author student
 */
public class Action {
	
	private String s;
	
	public void addBook() {
		System.out.println("增加图书的普通方法...");
	}
	
	public String delBook() {
		System.out.println("删除图书的普通方法...");
		return "del";
	}
	
	public void set(String s) {
		this.s = s;
	}
	
	public String get1() {
		System.out.println("get...");
		return s;
	}
}
