package com.sumavision.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/7
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler({ArrayIndexOutOfBoundsException.class})
	@ResponseBody
	public String handleArrayIndexOutOfBoundsException(Exception e) {
		e.printStackTrace();
		return "testArrayIndexOutOfBoundsException";
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception exception, WebRequest request) {
		ModelAndView modelAndView = new ModelAndView("error");
		modelAndView.addObject("errorMessage", exception.getMessage());
		return modelAndView;
	}
	
	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("msg", "额外信息");
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		// 过滤掉id
		webDataBinder.setDisallowedFields("id");
	}
}
