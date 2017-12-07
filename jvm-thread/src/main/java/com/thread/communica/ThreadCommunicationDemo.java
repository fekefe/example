package com.thread.communica;

import com.DemoUtil;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;

/**
 * 线程区间的通信
 */
public class ThreadCommunicationDemo {


	/**
	 * 不控制A B线程，自由运行
	 */
	@Test
	public void demo1() {
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				DemoUtil.printNumber("A");
			}
		});
		Thread b = new Thread(new Runnable() {
			@Override
			public void run() {
				DemoUtil.printNumber("B");
			}
		});
		a.start();
		b.start();
		DemoUtil.sleep(2000);
	}

	/**
	 * B 在 A 全部打印 完后再开始打印
	 */
	@Test
	public void demo2() {
		final Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				DemoUtil.printNumber("A");
			}
		});
		Thread b = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("B 开始等待 A");
				try {
					a.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				DemoUtil.printNumber("B");
			}
		});
		a.start();
		b.start();
		DemoUtil.sleep(2000);
	}

	/**
	 * 两个线程按照指定方式有序交叉运行
	 * 1.首先创建一个 A 和 B 共享的对象锁 lock = new Object();
	 * 2.当 A 得到锁后，先打印 1，然后调用 lock.wait() 方法，交出锁的控制权，进入 wait 状态；
	 * 3.对 B 而言，由于 A 最开始得到了锁，导致 B 无法执行；直到 A 调用 lock.wait() 释放控制权后， B 才得到了锁；
	 * 4.B 在得到锁后打印 1， 2， 3；然后调用 lock.notify() 方法，唤醒正在 wait 的 A;
	 * 5.A 被唤醒后，继续打印剩下的 2，3。
	 */
	@Test
	public void demo3() {
		final Object lock = new Object();
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					System.out.println("A 1");
					DemoUtil.sleep(1000);
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("A 2");
					System.out.println("A 3");
				}
			}
		});
		Thread b = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					System.out.println("B 1");
					System.out.println("B 2");
					System.out.println("B 3");
					lock.notify();
				}
			}
		});
		a.start();
		DemoUtil.sleep(100);
		b.start();
		DemoUtil.sleep(2000);
	}


	/**
	 *
	 */
	@Test
	public void demo4() {
		int worker = 3;
		final CountDownLatch countDownLatch = new CountDownLatch(worker);
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("D is waiting for other three threads");
				try {
					countDownLatch.await();
					System.out.println("All done, D starts working");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		for (char threadName = 'A'; threadName <= 'C'; threadName++) {
			final String tN = String.valueOf(threadName);
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(tN + " is working");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(tN + " finished");
					countDownLatch.countDown();
				}
			}).start();
		}
		DemoUtil.sleep(2000);
	}

	/**
	 * 三个运动员各自准备，等到三个人都准备好后，再一起跑
	 */
	@Test
	public void demo5() {
		int runner = 3;
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
		final Random random = new Random();
		for (char runnerName = 'A'; runnerName <= 'C'; runnerName++) {
			final String rN = String.valueOf(runnerName);
			new Thread(new Runnable() {
				@Override
				public void run() {
					long prepareTime = random.nextInt(3000) + 5000;
					System.out.println(rN + " is preparing for time:" + prepareTime);
					try {
						Thread.sleep(prepareTime);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println(rN + " is prepared, waiting for others");
					try {
						cyclicBarrier.await(); // 当前运动员准备完毕，等待别人准备好
					} catch (InterruptedException | BrokenBarrierException e) {
						e.printStackTrace();
					}
					System.out.println(rN + " starts running"); // 所有运动员都准备好了，一起开始跑
				}
			}).start();
		}
		DemoUtil.sleep(9000);
	}

	/**
	 * 子线程完成某件任务后，把得到的结果回传给主线程
	 */
	@Test
	public void demo6() {
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				System.out.println("Task starts");
				Thread.sleep(1000);
				int result = 0;
				for (int i = 0; i <= 100; i++) {
					result += i;
				}
				System.out.println("Task finished and return result");
				return result;
			}
		};
		FutureTask<Integer> futureTask = new FutureTask<>(callable);
		new Thread(futureTask).start();
		try {
			System.out.println("Before futureTask.get()");
			System.out.println("Result: " + futureTask.get());
			System.out.println("After futureTask.get()");
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		DemoUtil.sleep(2000);
	}


}
