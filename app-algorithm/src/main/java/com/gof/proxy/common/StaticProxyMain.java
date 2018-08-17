package com.gof.proxy.common;

import com.gof.proxy.JavaCoderImpl;

/**
 * @author gaoquan on 2017/8/9.
 */
public class StaticProxyMain {
	
	public static void main(String[] args) {
		JavaCoderImpl coder = new JavaCoderImpl("billy");
		StaticProxy proxy = new StaticProxy(coder);
		proxy.implDemands("java, static proxy");
		proxy.doSomething("java, static proxy");
	}
	
}
