package com.gof.state;

import com.gof.state.impl.StartStateImpl;
import com.gof.state.impl.StopStateImpl;

/**
 * 状态模式
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class StatePatternDemo {
	
	public static void main(String[] args) {
		Context context = new Context();
		
		StartStateImpl startState = new StartStateImpl();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopStateImpl stopState = new StopStateImpl();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
	}
	
}
