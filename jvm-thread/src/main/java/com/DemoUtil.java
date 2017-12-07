package com;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2017/12/7
 */
public class DemoUtil {

	public static void printNumber(String threadName) {
		int i = 0;
		while (i++ < 3) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " print: " + i);
		}
	}

	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
