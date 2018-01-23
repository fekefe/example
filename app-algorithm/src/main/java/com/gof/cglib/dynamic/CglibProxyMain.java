package com.gof.cglib.dynamic;

import com.gof.cglib.Action;
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
		Action bossAction = bossProxy.bind(Action.class);
		bossAction.addBook();
		String s = bossAction.delBook();
		System.out.println(s);
		
		s = "";
		System.out.println(s);
		
		CglibProxy proxy = new CglibProxy();
		Action action1 = proxy.bind(Action.class);
		action1.addBook();
		s = action1.delBook();
		System.out.println(s);
		
	}
	
	/**
	 * 同一个代理多次生成的实例是不同的对象
	 */
	@Test
	public void test2() {
		CglibProxy cglibProxy = new CglibProxy();
		Action bossAction = cglibProxy.bind(Action.class);
		bossAction.addBook();
		bossAction.set("1111");
		System.out.println(" bossAction.get1():" + bossAction.get1());
		
		Action action1 = cglibProxy.bind(Action.class);
		action1.addBook();
		System.out.println("action1.get1():" + action1.get1());
	}
	
}
