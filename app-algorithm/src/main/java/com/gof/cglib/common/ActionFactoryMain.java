package com.gof.cglib.common;

import com.gof.cglib.Action;

/**
 * @author gaoquan on 2017/8/9.
 */
public class ActionFactoryMain {

	public static void main(String[] args) {
		Action impl = ActionFactory.getInstance();
		impl.addBook();
		impl.delBook();
	}
}
