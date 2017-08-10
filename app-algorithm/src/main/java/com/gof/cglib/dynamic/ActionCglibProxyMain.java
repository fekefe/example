package com.gof.cglib.dynamic;

import com.gof.cglib.Action;

/**
 * @author gaoquan on 2017/8/9.
 */
public class ActionCglibProxyMain {

	public static void main(String[] args) {
		ActionCglibProxy bossProxy = new ActionCglibProxy("boss");
		Action bossAction = (Action) bossProxy.getAction(Action.class);
		bossAction.addBook();
		bossAction.delBook();


		ActionCglibProxy proxy = new ActionCglibProxy("boss1");
		Action action1 = (Action) proxy.getAction(Action.class);
		action1.addBook();
		action1.delBook();
	}

}
