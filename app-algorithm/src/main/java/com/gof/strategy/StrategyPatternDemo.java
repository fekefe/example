package com.gof.strategy;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
		
		
		Strategy strategy = new OperationAdd();
		System.out.println("10 + 5 = " + strategy.doOperation(10, 5));
		
		strategy = new OperationSubstract();
		System.out.println("10 - 5 = " + strategy.doOperation(10, 5));
		
		strategy = new OperationMultiply();
		System.out.println("10 * 5 = " + strategy.doOperation(10, 5));
	}
}
