package com.suma.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/7
 */
@Service
public class PushService {
	private DeferredResult<String> deferredResult;
	
	public DeferredResult<String> getAsyncUpdate() {
		deferredResult = new DeferredResult<>();
		return deferredResult;
	}
	
	@Scheduled(fixedDelay = 5000)
	public void refresh() {
		if (deferredResult != null) {
			deferredResult.setResult(new Long(System.currentTimeMillis()).toString());
		}
	}
}
