package com.gof.strategy;

/**
 * 执行器
 * @author gaoquan on 2018/2/11
 */
public class Actuator {
	private IStrategy strategy;
	
	public Actuator(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int exec(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}
