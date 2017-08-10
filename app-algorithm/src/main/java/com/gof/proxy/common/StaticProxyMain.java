package com.gof.proxy.common;

import com.gof.proxy.JavaCoder;

/**
 * @author gaoquan on 2017/8/9.
 */
public class StaticProxyMain {

	public static void main(String[] args) {
		JavaCoder coder = new JavaCoder("billy");
		StaticProxy proxy = new StaticProxy(coder);
		proxy.implDemands("java, static proxy");
		proxy.doSomething("java, static proxy");
	}
}
