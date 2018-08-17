package com.gof.facade.impl;

import com.gof.facade.IShape;

/**
 * @author gaoquan on 2018/8/17
 */
public class RectangleImpl implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
	
}
