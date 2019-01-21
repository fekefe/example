package com.boot.example.service;

import com.boot.example.mq.define.BaseDefSync;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/11
 */
@Service
public class SendService {
	
	@Autowired
	private AmqpTemplate amqpTemplate;    //消息推送
	
	public void send() {
		amqpTemplate.convertAndSend(BaseDefSync.SYNC_ROUTING, "hello,rabbit~");
	}
	
}
