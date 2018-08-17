package com.gof.facade;

import com.gof.facade.impl.CircleImpl;
import com.gof.facade.impl.RectangleImpl;
import com.gof.facade.impl.SquareImpl;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class ShapeMaker {
	
	private IShape circle;
	private IShape rectangle;
	private IShape square;
	
	public ShapeMaker() {
		circle = new CircleImpl();
		rectangle = new RectangleImpl();
		square = new SquareImpl();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
}
