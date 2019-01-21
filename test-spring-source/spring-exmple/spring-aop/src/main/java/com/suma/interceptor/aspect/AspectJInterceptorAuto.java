package com.suma.interceptor.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/17
 */
@Component
@Aspect
public class AspectJInterceptorAuto {
	
	@Around("execution (* com.suma.interceptor.aspect.app.*(..))")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		System.out.println("AutoAspectJInterceptor begin around");
		Object object = point.proceed();
		System.out.println("AutoAspectJInterceptor end around");
		return object;
	}
	
}
