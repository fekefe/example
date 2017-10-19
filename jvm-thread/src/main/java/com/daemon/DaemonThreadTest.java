package com.daemon;

import java.util.concurrent.TimeUnit;

/**
 * 守护线程demo
 * Created by Administrator on 2016/11/2.
 */
public class DaemonThreadTest {
	public static void main(String[] args) {
		Thread mainThread = new Thread(new Runnable() {
			@Override
			public void run() {
				Thread childThread = new Thread(new ClildThread());

				// 主线程中建立一个守护线程，当主线程结束时，守护线程也跟着结束。
				// childThread.setDaemon(true);


				// 可以看到，当主线程结束时，childThread是非守护线程，就会无限的执行。
				// childThread.setDaemon(false);
				childThread.start();
				System.out.println("I'm main thread...");
			}
		});
		mainThread.start();
	}
}

class ClildThread implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("I'm child thread..");
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println("I'm child thread..1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

