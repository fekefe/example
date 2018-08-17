package com.gof.decorator.impl;

import com.gof.decorator.IShape;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class CircleImpl implements IShape {
	@Override
	public void draw() {
		System.out.println("Shape: Circle");
	}
}
