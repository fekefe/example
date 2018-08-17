package com.gof.factory;

/**
 * @author gaoquan on 2018/2/11
 */
public class SquareImpl implements IShape {
	
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}