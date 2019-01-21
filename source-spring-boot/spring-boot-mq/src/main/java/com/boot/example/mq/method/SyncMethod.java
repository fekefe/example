// package com.boot.example.mq.method;
//
// import com.boot.example.mq.define.BaseDefSync;
// import com.boot.example.mq.struct.BaseMsgSync;
// import org.springframework.amqp.core.AmqpTemplate;
//
// /**
//  * 数据同步相关的工具类
//  */
// public class SyncMethod {
//
// 	/**
// 	 * 发送准备数据同步的消息
// 	 * @param template AmqpTemplate
// 	 * @param syncId   本轮同步的唯一标识
// 	 * @param syncName 本轮同步的业务标识
// 	 * @param content  同步的内容
// 	 */
// 	public static void sendForReady(AmqpTemplate template, String syncId, String syncName, Object content) {
// 		BaseMsgSync mq = new BaseMsgSync(true, syncId, syncName, content);
// 		template.convertAndSend(BaseDefSync.SYNC_EXCHANGE, BaseDefSync.SYNC_ROUTING, mq);
// 	}
//
//
// 	/**
// 	 * 发送进行数据同步的消息
// 	 * @param template AmqpTemplate
// 	 * @param syncId   本轮同步的唯一标识
// 	 * @param syncName 本轮同步的业务标识
// 	 * @param content  同步的内容
// 	 */
// 	public static void sendForExec(AmqpTemplate template, String syncId, String syncName, Object content) {
// 		BaseMsgSync mq = new BaseMsgSync(false, syncId, syncName, content);
// 		template.convertAndSend(BaseDefSync.SYNC_EXCHANGE, BaseDefSync.SYNC_ROUTING, mq);
// 	}
//
// }
