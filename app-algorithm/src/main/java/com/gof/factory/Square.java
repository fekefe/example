package com.gof.factory;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class Square implements Shape {
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}