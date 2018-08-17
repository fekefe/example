package com.gof.observer;

/**
 * @author gaoquan on 2018/2/11
 */
public abstract class Observer {
	
	protected Subject subject;
	
	public abstract void update();
	
}
