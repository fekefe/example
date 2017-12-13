package com.gof.cglib.dynamic;

import com.gof.cglib.Action;

/**
 * @author gaoquan on 2017/8/9.
 */
public class CglibProxyMain {

	public static void main(String[] args) {
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

}
