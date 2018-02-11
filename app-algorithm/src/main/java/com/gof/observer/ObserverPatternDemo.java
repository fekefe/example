package com.gof.observer;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/11
 */
public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new HexObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		
		System.out.println();
		
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
