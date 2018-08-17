package com.gof.decorator;

/**
 * @author gaoquan on 2018/2/11
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
