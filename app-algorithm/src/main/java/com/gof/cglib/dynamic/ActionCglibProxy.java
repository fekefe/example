package com.gof.cglib.dynamic;

import com.gof.cglib.Action;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib.
 *
 * @author gaoquan on 2017/8/9.
 */
public class ActionCglibProxy implements MethodInterceptor {

	private String name;

	private Enhancer enhancer = new Enhancer();

	public ActionCglibProxy(String name) {
		super();
		this.name = name;
	}

	/**
	 * 拦截操作
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println(name + " before ");
		Object result = proxy.invokeSuper(obj, args);
		System.out.println(name + " after ");
		return result;
	}

	public Object getAction(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}


}
