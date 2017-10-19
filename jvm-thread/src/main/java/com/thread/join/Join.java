package com.thread.join;

import org.junit.Test;

/**
 * @author gaoquan on 2017/9/25
 */
public class Join implements Runnable {

	public static int a = 0;

	public void run() {
		for (int k = 0; k < 5; k++) {
			a = a + 1;
		}

		/*
		如果加入while，调用join时候，线程不能停止
		while (true) {
			for (int k = 0; k < 5; k++) {
				a = a + 1;
			}
		}
		*/
	}

	@Test
	public void test1() {
		Runnable r = new Join();
		Thread t = new Thread(r);
		t.start();
		System.out.println(a);
	}


	@Test
	public void test2() throws InterruptedException {
		Runnable r = new Join();
		Thread t = new Thread(r);
		t.start();
		// 使调用该方法的线程在此之前执行完毕
		t.join();// T线程执行完，才能进行后面
		System.out.println(a);
	}
}
