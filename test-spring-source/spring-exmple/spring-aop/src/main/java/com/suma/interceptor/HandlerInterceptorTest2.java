package com.suma.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/17
 */
public class HandlerInterceptorTest2 extends HandlerInterceptorAdapter {
	
	/**
	 * 在业务处理器处理请求之前被调用
	 */
	@Override
	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		return false;
	}
	
	/**
	 * 在业务处理器处理请求完成之后，生成视图之前执行
	 */
	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
	
	}
	
	/**
	 * 在DispatcherServlet完全处理完请求之后被调用，可用于清理资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
	
	}
}
