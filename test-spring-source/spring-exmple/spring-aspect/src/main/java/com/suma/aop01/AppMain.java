package com.suma.aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/12
 */
public class AppMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:spring-aop01.xml");
		Math math = ctx.getBean("math", Math.class);
		int n1 = 100, n2 = 5;
		math.add(n1, n2);
		math.sub(n1, n2);
		math.mut(n1, n2);
		math.div(n1, n2);
		
		// StrUtil strUtil = ctx.getBean("strUtil", StrUtil.class);
		// strUtil.show();
	}
	
}
