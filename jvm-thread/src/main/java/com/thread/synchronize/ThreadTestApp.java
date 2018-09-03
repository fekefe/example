package com.thread.synchronize;

import org.junit.Test;

/**
 *
 * synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种：
 1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象；
 2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象；
 3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象；
 4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/8/24
 */
public class ThreadTestApp {
	
	/**
	 * 静态的方法
	 */
	@Test
	public void staticGet() throws Exception {
		new Thread(() -> {
			System.out.println("--------------------1 begin");
			ThreadTest.staticGet1("1");
		}).start();
		
		new Thread(() -> {
			System.out.println("--------------------2 begin");
			ThreadTest.staticGet1("2");
		}).start();
		
		new Thread(() -> {
			System.out.println("--------------------3 begin");
			ThreadTest.staticGet2("3");
		}).start();
		
		Thread.sleep(10000000);
	}
	
	/**
	 * 使用不同的对象
	 * 修改一个方法
	 */
	@Test
	public void get1() throws Exception {
		new Thread(() -> {
			ThreadTest test1 = new ThreadTest();
			System.out.println("--------------------1 begin");
			test1.get1("1");
		}).start();
		
		new Thread(() -> {
			ThreadTest test1 = new ThreadTest();
			System.out.println("--------------------2 begin");
			test1.get1("2");
		}).start();
		
		new Thread(() -> {
			ThreadTest test1 = new ThreadTest();
			System.out.println("--------------------3 begin");
			test1.get2("3");
		}).start();
		
		Thread.sleep(10000000);
	}
	
	/**
	 * 使用相同的对象
	 * 修改一个方法
	 */
	@Test
	public void get2() throws Exception {
		ThreadTest test1 = new ThreadTest();
		new Thread(() -> {
			System.out.println("--------------------1 begin");
			test1.get1("1");
		}).start();
		
		new Thread(() -> {
			System.out.println("--------------------2 begin");
			test1.get1("2");
		}).start();
		
		new Thread(() -> {
			System.out.println("--------------------3 begin");
			test1.get2("3");
		}).start();
		
		Thread.sleep(10000000);
	}
	
}
