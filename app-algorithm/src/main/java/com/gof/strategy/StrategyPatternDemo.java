package com.gof.strategy;

/**
 * 策略模式
 * 定义一系列的算法，把它们一个个封装起来, 并且使它们可相互替换。
 * <br>
 * 根据处理数据的不同需求对算法做出选择，而这些算法是固定的，适合使用策略模式，
 * 在实际项目中比如支付（可选支付宝，银联卡，微信支付等）需求。
 */
public class StrategyPatternDemo {
	
	public static void main(String[] args) {
		
		Actuator actuator = new Actuator(new OperationAddImpl());
		System.out.println("10 + 5 = " + actuator.exec(10, 5));
		
		actuator = new Actuator(new OperationSubtractImpl());
		System.out.println("10 - 5 = " + actuator.exec(10, 5));
		
		actuator = new Actuator(new OperationMultiplyImpl());
		System.out.println("10 * 5 = " + actuator.exec(10, 5));
		
		
		IStrategy strategy = new OperationAddImpl();
		System.out.println("10 + 5 = " + strategy.doOperation(10, 5));
		
		strategy = new OperationSubtractImpl();
		System.out.println("10 - 5 = " + strategy.doOperation(10, 5));
		
		strategy = new OperationMultiplyImpl();
		System.out.println("10 * 5 = " + strategy.doOperation(10, 5));
		
	}
	
}
