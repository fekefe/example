package com.gof.proxy.dynamic;

import com.gof.proxy.ICoder;
import com.gof.proxy.JavaCoder;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author gaoquan on 2017/8/9.
 */
public class JdkProxyMain {

	public static void main(String args[]) {
		//要代理的真实对象
		ICoder coder = new JavaCoder("billy");

		//创建中介类实例
		JdkProxy handler = new JdkProxy(coder);
		ICoder proxy = handler.bind(ICoder.class);

		//通过代理类，执行doSomething方法；
		proxy.implDemands("java, dynamic proxy");
		proxy.doSomething("wtf");
	}


	@Test
	public void other() {
		//要代理的真实对象
		ICoder coder = new JavaCoder("billy");

		//创建中介类实例
		JdkProxy handler = new JdkProxy(coder);

		//获取类加载器
		ClassLoader classLoader = coder.getClass().getClassLoader();

		Class<?>[] interfaces = coder.getClass().getInterfaces();
		//动态产生一个代理类
		ICoder proxy = (ICoder) Proxy.newProxyInstance(classLoader, interfaces, handler);

		//通过代理类，执行doSomething方法；
		proxy.implDemands("java, dynamic proxy");
		proxy.doSomething("wtf");
	}
}
