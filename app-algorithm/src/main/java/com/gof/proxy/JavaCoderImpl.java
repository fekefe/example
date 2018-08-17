package com.gof.proxy;

/**
 * 真实角色
 * @author gaoquan on 2017/8/9.
 */
public class JavaCoderImpl implements ICoder {
	
	private String name;
	
	public JavaCoderImpl(String name) {
		this.name = name;
	}
	
	@Override
	public void implDemands(String demandName) {
		System.out.println(name + " write coder by " + demandName);
	}
	
	@Override
	public void doSomething(String what) {
		System.out.println(name + " do something " + what);
	}
	
}
