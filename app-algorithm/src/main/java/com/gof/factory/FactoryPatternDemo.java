package com.gof.factory;

/**
 * 工厂
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		// ShapeFactory shapeFactory = new ShapeFactory();
		
		//获取 Rectangle 的对象，并调用它的 draw 方法
		IShape shape2 = ShapeFactory.getClass(RectangleImpl.class);
		
		//调用 Rectangle 的 draw 方法
		shape2.draw();
		
		//获取 Square 的对象，并调用它的 draw 方法
		IShape shape3 = ShapeFactory.getClass(SquareImpl.class);
		
		//调用 Square 的 draw 方法
		shape3.draw();
	}
}
