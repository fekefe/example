package com.gof.decorator.impl;

import com.gof.decorator.IShape;

/**
 * @author gaoquan on 2018/2/11
 */
public class RectangleImpl implements IShape {
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}
}