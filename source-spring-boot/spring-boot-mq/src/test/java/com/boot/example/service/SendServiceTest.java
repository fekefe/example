package com.boot.example.service;

import com.boot.example.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/11
 */
public class SendServiceTest extends BaseTest{
	
	@Autowired
	private SendService sendService;
	
	@Test
	public void sendTest() {
		sendService.send();
	}
	
}