package com.gof.strategy;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
