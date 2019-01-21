package com.suma.interceptor.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/17
 */
@Component
public class AspectJInterceptorBean {
	
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("AspectJInterceptor around before");
		Object object = proceedingJoinPoint.proceed();
		System.out.println("AspectJInterceptor around after");
		return object;
	}
}
