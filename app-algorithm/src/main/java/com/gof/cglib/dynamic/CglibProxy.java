package com.gof.cglib.dynamic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib.
 *
 * @author gaoquan on 2017/8/9.
 */
public class CglibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();

	public CglibProxy() {
		super();
	}

	public <T> T bind(Class<T> clazz) {
		// 设置代理目标，被代理的类的Class对象
		enhancer.setSuperclass(clazz);
		// 设置回调 ，要求参数为实现了MethodInterceptor接口的类
		enhancer.setCallback(this);
		//指定加载器为加载目标类的加载器。（不能指定为加载本类的加载器）
		enhancer.setClassLoader(clazz.getClassLoader());
		return (T) enhancer.create();
	}

	/**
	 * 拦截操作
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println(" before " + System.currentTimeMillis());
		Object result = proxy.invokeSuper(obj, args);
		System.out.println(" after " + System.currentTimeMillis());
		return result;
	}


}
