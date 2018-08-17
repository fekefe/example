package com.gof.factory;

/**
 * @author gaoquan on 2018/2/11
 */
public class RectangleImpl implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}