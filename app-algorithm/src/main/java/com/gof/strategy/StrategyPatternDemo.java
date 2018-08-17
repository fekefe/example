package com.gof.strategy;

/**
 * 策略模式
 * 定义一系列的算法，把它们一个个封装起来, 并且使它们可相互替换。
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		
		
		Strategy strategy = new OperationAdd();
		System.out.println("10 + 5 = " + strategy.doOperation(10, 5));
		
		strategy = new OperationSubtract();
		System.out.println("10 - 5 = " + strategy.doOperation(10, 5));
		
		strategy = new OperationMultiply();
		System.out.println("10 * 5 = " + strategy.doOperation(10, 5));
	}
}
