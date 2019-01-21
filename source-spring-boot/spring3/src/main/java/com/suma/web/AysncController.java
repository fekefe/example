package com.suma.web;

import com.suma.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/7
 */
@Controller
public class AysncController {
	
	@Autowired
	PushService pushService;
	
	@ResponseBody
	@RequestMapping("/defer")
	public DeferredResult<String> deferredCall() {
		return pushService.getAsyncUpdate();
	}
}
