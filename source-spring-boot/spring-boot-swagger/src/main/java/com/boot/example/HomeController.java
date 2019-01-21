package com.boot.example;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/19
 */
@Controller
public class HomeController {
	
	@ApiIgnore
	@RequestMapping("/")
	public String home() {
		return "redirect:swagger-ui.html";
	}
	
}

