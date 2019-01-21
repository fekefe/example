// package com.boot.example.service;
//
// import com.alibaba.fastjson.JSON;
// import com.boot.example.base.BaseLogMethod;
// import com.boot.example.mq.struct.BaseMsgSync;
// import org.springframework.amqp.rabbit.annotation.RabbitHandler;
// import org.springframework.amqp.rabbit.annotation.RabbitListener;
// import org.springframework.stereotype.Component;
//
// /**
//  * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/9/11
//  */
// @Component
// @RabbitListener(queues = "sync.A")
// public class ReceiveListener {
//
// 	private static final String TAG = "ReceiveListener";
//
// 	@RabbitHandler
// 	public void receiveSyncMQ(BaseMsgSync bms) {
// 		BaseLogMethod.logInfo(TAG, "receiveSyncMQ : {}", JSON.toJSONString(bms));
// 	}
//
// }
