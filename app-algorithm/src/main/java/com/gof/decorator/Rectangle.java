package com.gof.decorator;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}