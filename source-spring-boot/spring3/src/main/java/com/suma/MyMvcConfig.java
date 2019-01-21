package com.suma;

import com.suma.interceptor.DemoInterceptor;
import com.suma.message.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * application.xml 配置
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/4
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.suma")
public class MyMvcConfig extends WebMvcConfigurerAdapter {
	
	/**
	 * 视图解析器ViewResolver
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver;
	}
	
	/**
	 * 处理文件上传解析器MultipartResolver
	 */
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(10 * 1024 * 1024);
		return multipartResolver;
	}
	
	/**
	 * 重写-静态路径
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
	}
	
	/**
	 * 重写-视图直接跳转
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/toUpload").setViewName("upload");
		registry.addViewController("/converter").setViewName("converter");
		registry.addViewController("/sse").setViewName("sse");
	}
	
	/**
	 * 重写-拦截器
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new DemoInterceptor());
	}
	
	/**
	 * 重写-过滤器
	 */
	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		// converters.add(converter());
		converters.add(new MyMessageConverter());
	}
	
	
}
