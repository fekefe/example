package com.thread.synchronize;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/24
 */
public class ThreadTest {
	
	
	public synchronized static void staticGet1(String vo) {
		System.out.println("get1:" + vo);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized static void staticGet2(String vo) {
		System.out.println("get2:" + vo);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void get1(String vo) {
		System.out.println("get2:" + vo);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void get2(String vo) {
		System.out.println("get2:" + vo);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
