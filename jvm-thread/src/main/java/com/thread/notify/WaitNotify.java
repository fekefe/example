package com.thread.notify;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Wait notify
 */
public class WaitNotify {

	private static boolean flag = true;
    private static final Object lock = new Object();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
//		for (int i = 0; i < 5; i++) {
//			Thread waitThread = new Thread(new Wait(), "WaitThread" + i);
//			waitThread.start();
//		}
		Thread waitThread = new Thread(new Wait(), "WaitThread");
		waitThread.start();
		TimeUnit.SECONDS.sleep(1);
		Thread notifyThread = new Thread(new Notify(), "NotifyThread");
		notifyThread.start();

	}

    private static class Wait implements Runnable {
		@Override
		public void run() {
			synchronized (lock) {
				while (flag) {
					try {
						System.out.println(Thread.currentThread() + " flag true " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
						lock.wait();
					} catch (InterruptedException e) {
                        break;
					}
				}
				System.out.println(Thread.currentThread() + " flag false " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
			}
		}
	}

    private static class Notify implements Runnable {
		@Override
		public void run() {
			synchronized (lock) {
				while (flag) {
					System.out.println(Thread.currentThread() + " lock " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
					lock.notifyAll();
					flag = false;
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			synchronized (lock) {
				System.out.println(Thread.currentThread() + " lock again " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
