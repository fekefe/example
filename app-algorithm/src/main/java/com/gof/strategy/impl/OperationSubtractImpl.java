package com.gof.strategy.impl;

import com.gof.strategy.IStrategy;

/**
 * @author gaoquan on 2018/2/11
 */
public class OperationSubtractImpl implements IStrategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}