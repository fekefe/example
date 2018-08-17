package com;

/**
 * @author gaoquan on 2017/12/7
 */
public class DemoUtil {

	public static void printNumber(String threadName) {
		int i = 0;
		while (i++ < 3) {
			sleep(100);
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
