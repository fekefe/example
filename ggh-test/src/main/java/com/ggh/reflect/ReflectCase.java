package com.ggh.reflect;

import java.lang.reflect.Method;

/**
 * Created by gaoquan on 2017/3/24.
 */
public class ReflectCase {

	public static void main(String[] args) throws Exception {
		Proxy target = new Proxy();
		System.out.println(Proxy.class);


		Class<?> proxy = Class.forName("com.ggh.reflect.ReflectCase$Proxy");
		System.out.println(proxy);

		Method method = Proxy.class.getDeclaredMethod("run");
		method.invoke(target);

		Method method1 = Proxy.class.getMethod("run");
		method1.invoke(target);
	}

	static class Proxy {
		public void run() {
			System.out.println("run");
		}
	}
}
