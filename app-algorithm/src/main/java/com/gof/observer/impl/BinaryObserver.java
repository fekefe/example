package com.gof.observer.impl;

import com.gof.observer.Observer;
import com.gof.observer.Subject;

/**
 * @author gaoquan on 2018/2/11
 */
public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}
	
}