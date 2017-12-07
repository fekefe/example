package com.thread.join;

import org.junit.Test;

/**
 * 现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行
 *
 * @author gaoquan on 2017/9/25
 */
public class Join2 {

	@Test
	public void mainTest() {
		Thread t1 = createThread("t1", null);
		Thread t2 = createThread("t2", t1);
		Thread t3 = createThread("t3", t2);

		t2.start();
		t3.start();
		t1.start();

		sleep();
	}

	private Thread createThread(String str, Thread t) {
		return new Thread(createRunnable(str, t), str);
	}

	private Runnable createRunnable(final String str, final Thread t) {

		return new Runnable() {
			@Override
			public void run() {
				System.out.println(str + "执行.");
				if (t != null) {
					System.out.println(str + "等待" + t.getName());
					try {
						t.join();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				printNumber(str);
			}
		};
	}

	private void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void printNumber(String threadName) {
		int i = 0;
		while (i++ < 1) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadName + " print: " + i);
		}
	}


}
