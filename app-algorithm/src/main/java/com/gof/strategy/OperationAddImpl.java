package com.gof.strategy;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class OperationAddImpl implements IStrategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}