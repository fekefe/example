package com.gof.observer;

/**
 * @author gaoquan on 2018/2/11
 */
public class HexObserver extends Observer {
	
	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
	}
}