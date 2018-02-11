package com.gof.observer;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public abstract class Observer {
	protected Subject subject;
	
	public abstract void update();
}
