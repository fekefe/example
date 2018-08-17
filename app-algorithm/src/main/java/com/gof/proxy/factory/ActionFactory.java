package com.gof.proxy.factory;

import com.gof.proxy.ActionImpl;

/**
 * @author gaoquan on 2017/8/9.
 */
public class ActionFactory {
	
	private static ActionImpl action = new ActionImpl();
	
	private ActionFactory() {
	}
	
	public static ActionImpl getInstance() {
		return action;
	}
}
