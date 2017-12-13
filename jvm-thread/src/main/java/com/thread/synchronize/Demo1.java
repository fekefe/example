package com.thread.synchronize;

import com.DemoUtil;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2017/12/7
 */
public class Demo1 {

	public void testClass1() {
		System.out.println("class1 init");
		synchronized (Demo1.class) {
			System.out.println("class1 synchronized begin");
			DemoUtil.sleep(5000);
			System.out.println("class1 synchronized end");
		}
	}

	public void testClass2() {
		System.out.println("class2 init");
		synchronized (Demo1.class) {
			System.out.println("class2 synchronized over");
		}
	}


	public void testThis1() {
		System.out.println("this1 init");
		synchronized (this) {
			System.out.println("this1 synchronized begin");
			DemoUtil.sleep(5000);
			System.out.println("this1 synchronized end");
		}
	}

	public void testThis2() {
		System.out.println("this2 init");
		synchronized (this) {
			System.out.println("this2 synchronized over");
		}
	}

	public void test() {
		System.out.println("test init");
		DemoUtil.sleep(1000);
		System.out.println("test service");
		DemoUtil.sleep(1000);
		System.out.println("test over");
	}

}
