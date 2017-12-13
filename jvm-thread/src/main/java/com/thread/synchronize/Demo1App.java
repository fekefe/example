package com.thread.synchronize;

import com.DemoUtil;
import org.junit.Test;

/**
 *
 */
public class Demo1App {


	/**
	 * synchronized(class)
	 * synchronized(class)
	 * －＞如果不同线程监视同一个实例或者不同的实例对象，都会等待．
	 */
	@Test
	public void testClassDiff() {
		final Demo1 demoA = new Demo1();
		final Demo1 demoB = new Demo1();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testClass1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoB.testClass2();
			}
		});
		thread1.start();
		thread2.start();

		DemoUtil.sleep(20000);
	}

	/**
	 * synchronized(this)
	 * synchronized(this)
	 * －＞如果不同线程监视同一个实例对象，就会等待，如果不同的实例，不会等待．
	 */
	@Test
	public void testThisDiff() {
		final Demo1 demoA = new Demo1();
		final Demo1 demoB = new Demo1();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testThis1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoB.testThis2();
			}
		});
		thread1.start();
		thread2.start();

		DemoUtil.sleep(20000);
	}

	///-------------------------///


	@Test
	public void testClass() {
		final Demo1 demoA = new Demo1();
		System.out.println("begin new 10 11");
		Thread thread10 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testClass1();
			}
		});
		Thread thread11 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testClass2();
			}
		});
		thread10.start();
		thread11.start();
		DemoUtil.sleep(10000);
	}

	@Test
	public void testClassB() {
		final Demo1 demoA = new Demo1();
		Thread thread10 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testClass1();
			}
		});
		Thread thread11 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.test();
			}
		});
		thread10.start();
		thread11.start();

		DemoUtil.sleep(20000);
	}

	/////////////////////////////////////


	/////////////////////////////
	@Test
	public void testThis() {
		final Demo1 demoA = new Demo1();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testThis1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testThis2();
			}
		});
		thread1.start();
		thread2.start();

		DemoUtil.sleep(20000);
	}


	@Test
	public void testThisB() {
		final Demo1 demoA = new Demo1();
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.testThis1();
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				demoA.test();
			}
		});
		thread1.start();
		thread2.start();

		DemoUtil.sleep(20000);
	}


	//---------------------------//


}
