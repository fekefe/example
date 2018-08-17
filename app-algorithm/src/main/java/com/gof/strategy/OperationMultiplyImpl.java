package com.gof.strategy;

/**
 * @author gaoquan on 2018/2/11
 */
public class OperationMultiplyImpl implements IStrategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}
