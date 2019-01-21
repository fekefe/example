package com.suma.web;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/7
 */

import com.suma.bean.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class AdviceController {
	
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
		throw new IllegalArgumentException("参数有误" + msg);
	}
	
	@RequestMapping(value = "/e/{id}", method = {RequestMethod.GET})
	@ResponseBody
	public String testExceptionHandle2(@PathVariable(value = "id") Integer id) {
		List<String> list = Arrays.asList(new String[]{"a", "b", "c", "d"});
		return list.get(id - 1);
	}
}
