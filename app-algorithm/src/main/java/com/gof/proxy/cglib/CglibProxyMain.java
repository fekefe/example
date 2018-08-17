package com.gof.proxy.cglib;

import com.gof.proxy.ActionImpl;
import org.junit.Test;

/**
 * cglib动态代理api
 * @author gaoquan on 2017/8/9.
 */
public class CglibProxyMain {
	
	/**
	 * 常规生成
	 */
	@Test
	public void test1() {
		CglibProxy bossProxy = new CglibProxy();
		ActionImpl bossAction = bossProxy.bind(ActionImpl.class);
		bossAction.addBook();
		String message = bossAction.delBook();
		System.out.println(message);
		
		message = "";
		System.out.println(message);
		
		CglibProxy proxy = new CglibProxy();
		ActionImpl action1 = proxy.bind(ActionImpl.class);
		action1.addBook();
		message = action1.delBook();
		System.out.println(message);
	}
	
	/**
	 * 同一个代理多次生成的实例是不同的对象
	 */
	@Test
	public void test2() {
		CglibProxy cglibProxy = new CglibProxy();
		ActionImpl bossAction = cglibProxy.bind(ActionImpl.class);
		bossAction.addBook();
		bossAction.set("1111");
		System.out.println(" bossAction.get1():" + bossAction.get1());
		
		ActionImpl action1 = cglibProxy.bind(ActionImpl.class);
		action1.addBook();
		System.out.println("action1.get1():" + action1.get1());
	}
	
}
