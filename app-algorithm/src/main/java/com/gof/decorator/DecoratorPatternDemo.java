package com.gof.decorator;

import com.gof.decorator.impl.CircleImpl;
import com.gof.decorator.impl.RectangleImpl;

/**
 * 装饰器模式
 * 接口-》抽象-》实现
 * @author gaoquan on 2018/2/11
 */
public class DecoratorPatternDemo {
	public static void main(String[] args) {
		
		IShape circle = new CircleImpl();
		
		IShape redCircle = new RedShapeDecorator(new CircleImpl());
		
		IShape redRectangle = new RedShapeDecorator(new RectangleImpl());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();
		
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
