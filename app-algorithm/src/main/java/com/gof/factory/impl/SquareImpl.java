package com.gof.factory.impl;

import com.gof.factory.IShape;

/**
 * @author gaoquan on 2018/2/11
 */
public class SquareImpl implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}