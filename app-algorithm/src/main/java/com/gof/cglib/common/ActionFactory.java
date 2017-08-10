package com.gof.cglib.common;

import com.gof.cglib.Action;

/**
 * @author gaoquan on 2017/8/9.
 */
public class ActionFactory {

	public static Action action = new Action();

	public static Action getInstance() {
		return action;
	}
}
