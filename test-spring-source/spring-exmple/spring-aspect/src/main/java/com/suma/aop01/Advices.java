package com.suma.aop01;

import org.aspectj.lang.JoinPoint;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/12
 */
public class Advices {
	
	public void before(JoinPoint jp) {
		System.out.println("----------前置通知----------");
		System.out.println(jp.getSignature().getName());
	}
	
	public void after(JoinPoint jp) {
		System.out.println("----------最终通知----------");
	}
	
}
