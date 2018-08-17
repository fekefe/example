package com.gof.facade;

/**
 * 外观模式（Facade Pattern）
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。
 * 这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。
 * 这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。
 * <br>
 * 适用性
 * 当要为一个复杂子系统提供一个简单接口时。
 * 客户程序与抽象类实现部分之间存在着很大的依赖性。
 * 当需要构建一个层次结构的子系统时，使用facade模式定义子系统中每层的入口点。
 * <br>
 * 效果
 * 1）对客户屏蔽子系统组件，因而减少了客户处理对象的数目并使得子系统使用起来更加方便。
 * 2）实现了子系统与客户之间的松耦合关系，而子系统内部的功能组件万网时紧耦合的。
 * 3）如果应用需要，外观模式并不限制他们使用子系统类。
 * @author gaoquan on 2018/8/17
 */
public class FacadePatternDemo {
	
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
	
}