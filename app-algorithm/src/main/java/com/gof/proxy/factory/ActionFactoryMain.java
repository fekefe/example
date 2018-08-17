package com.gof.proxy.factory;

import com.gof.proxy.ActionImpl;

/**
 * @author gaoquan on 2017/8/9.
 */
public class ActionFactoryMain {
	
	public static void main(String[] args) {
		ActionImpl impl = ActionFactory.getInstance();
		impl.addBook();
		impl.delBook();
	}
}
