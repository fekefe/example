package com.gof.proxy.common;

import com.gof.proxy.ICoder;

/**
 * 静态代理
 *
 * @author gaoquan on 2017/8/9.
 */
public class StaticProxy implements ICoder {
	private ICoder coder;

	public StaticProxy(ICoder coder) {
		this.coder = coder;
	}

	@Override
	public void implDemands(String demandName) {
		System.out.println("开始前");
		coder.implDemands(demandName);
		System.out.println("结束后");
	}

	@Override
	public void doSomething(String what) {
		System.out.println("开始前");
		coder.doSomething(what);
		System.out.println("结束后");
	}
}
