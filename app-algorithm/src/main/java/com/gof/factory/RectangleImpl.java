package com.gof.factory;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class RectangleImpl implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}