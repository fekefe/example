package com.gof.state;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/17
 */
public class Context {
	
	private IState state;
	
	public Context() {
		state = null;
	}
	
	public void setState(IState state) {
		this.state = state;
	}
	
	public IState getState() {
		return state;
	}
	
}
