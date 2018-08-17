package com.gof.decorator;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public abstract class ShapeDecorator implements IShape {
	protected IShape decoratedShape;
	
	public ShapeDecorator(IShape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}
