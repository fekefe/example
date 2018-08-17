package com.gof.decorator;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(IShape decoratedShape) {
		System.out.println("Border Color: Red");
	}
}