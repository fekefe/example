package com.gof.state.impl;

import com.gof.state.Context;
import com.gof.state.IState;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class StopStateImpl implements IState {
	
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop State";
	}
	
}
