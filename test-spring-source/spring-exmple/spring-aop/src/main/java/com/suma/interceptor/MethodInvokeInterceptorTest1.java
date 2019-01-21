package com.suma.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/17
 */
public class MethodInvokeInterceptorTest1 implements MethodInterceptor {
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before method invoke");
		Object object = invocation.proceed();
		System.out.println("after method invoke");
		return object;
	}
}

