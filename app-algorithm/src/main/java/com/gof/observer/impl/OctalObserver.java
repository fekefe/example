package com.gof.observer.impl;

import com.gof.observer.Observer;
import com.gof.observer.Subject;

/**
 * @author gaoquan on 2018/2/11
 */
public class OctalObserver extends Observer {
	
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
	}
	
}