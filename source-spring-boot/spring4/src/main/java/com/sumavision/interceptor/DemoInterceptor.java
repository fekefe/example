package com.sumavision.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * 拦截器
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/4
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {
	
	private ThreadLocal<String> threadLocalMap = new ThreadLocal<>();
	
	/**
	 * 在控制器方法调用前执行
	 * 返回值为是否中断
	 * true，表示继续执行（下一个拦截器或处理器）
	 * false，则会中断后续的所有操作，所以我们需要使用response来响应请求
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		String uuid = UUID.randomUUID().toString();
		threadLocalMap.set(uuid);
		System.out.println("请求时间:preHandle" + uuid);
		return true;
	}
	
	/**
	 * 在控制器方法调用后，解析视图前调用，我们可以对视图和模型做进一步渲染或修改
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		long startTime = (Long) request.getAttribute("startTime");
		request.removeAttribute("startTime");
		long endTime = System.currentTimeMillis();
		String uuid = threadLocalMap.get();
		System.out.println("请求时间:postHandle" + uuid + " " + (endTime - startTime) + "ms");
		request.setAttribute("handlingTime", endTime - startTime);
	}
	
	/**
	 * 整个请求完成，即视图渲染结束后调用，这个时候可以做些资源清理工作，或日志记录等
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		threadLocalMap.remove();
		System.out.println("请求时间:afterCompletion");
	}
	
	/**
	 * 处理异步请求
	 */
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("请求时间:afterConcurrentHandlingStarted");
	}
}
