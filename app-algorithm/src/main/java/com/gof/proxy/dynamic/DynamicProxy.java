package com.gof.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理，代理处理器.
 *
 * @author gaoquan on 2017/8/9.
 */
public class DynamicProxy implements InvocationHandler {
	private Object obj;

	public DynamicProxy(Object coder) {
		this.obj = coder;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(System.currentTimeMillis());
		Object result = method.invoke(obj, args);
		System.out.println(System.currentTimeMillis());
		return result;
	}
}
