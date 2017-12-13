package com.gof.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，代理处理器.
 *
 * @author gaoquan on 2017/8/9.
 */
public class JdkProxy implements InvocationHandler {
	private Object obj;

	public JdkProxy(Object object) {
		this.obj = object;
	}

	public <T> T bind(Class<T> classz) {
		return (T) Proxy.newProxyInstance(classz.getClassLoader(), classz.getInterfaces(), this);
	}

	/**
	 * 拦截操作
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(" before " + System.currentTimeMillis());
		Object result = method.invoke(obj, args);
		System.out.println(" after " + System.currentTimeMillis());
		return result;
	}
}
