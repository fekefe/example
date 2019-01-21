// package com.boot.example.mq.struct;
//
//
// import java.io.Serializable;
//
//
// public class BaseMsgSync implements Serializable {
// 	private static final long serialVersionUID = 1L;
//
//
// 	/**
// 	 * 本轮同步的消息类型：准备同步还是真正执行同步
// 	 */
// 	public boolean isReady = false;
//
// 	/**
// 	 * 本轮同步的唯一标识符
// 	 */
// 	public String syncId;
//
// 	/**
// 	 * 本轮同步的业务标识符
// 	 */
// 	public String syncName;
//
// 	/**
// 	 * 本轮同步的内容
// 	 */
// 	public Object syncData;
//
// 	public BaseMsgSync(boolean ready, String id, String name, Object data) {
// 		isReady = ready;
// 		syncId = id;
// 		syncName = name;
// 		syncData = data;
// 	}
//
// }
