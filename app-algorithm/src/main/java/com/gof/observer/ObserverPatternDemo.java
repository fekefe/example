package com.gof.observer;

import com.gof.observer.impl.BinaryObserver;
import com.gof.observer.impl.HexObserver;
import com.gof.observer.impl.OctalObserver;

/**
 * 观察者模式
 * <br>
 * 使用场景：
 * 1、有多个子类共有的方法，且逻辑相同。
 * 2、重要的、复杂的方法，可以考虑作为模板方法。
 * <br>
 * 注意事项：
 * 1、JAVA 中已经有了对观察者模式的支持类。
 * 2、避免循环引用。
 * 3、如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。
 * @author gaoquan on 2018/2/11
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
