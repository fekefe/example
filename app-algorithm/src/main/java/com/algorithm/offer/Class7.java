package com.algorithm.offer;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * 队列的声明如下：请实现他的两个函数appendTail和deleteHead，
 * 分别完成在队列尾部插入节点和在队列头部删除节点的功能。
 * @author gaoquan on 2018/1/25
 */
public class Class7 {
	private Stack<Object> stackPush = new Stack<>();
	private Stack<Object> stackPop = new Stack<>();
	
	public void appendTail(Object obj) {
		stackPush.push(obj);
	}
	
	public Object deleteHead() {
		if (stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	
	public static void main(String[] args) {
		Class7 classz = new Class7();
		classz.appendTail(1);
		classz.appendTail(2);
		classz.appendTail(3);
		classz.appendTail(4);
		classz.appendTail(5);
		
		System.out.println(classz.deleteHead());
		System.out.println(classz.deleteHead());
		System.out.println(classz.deleteHead());
		System.out.println(classz.deleteHead());
		System.out.println(classz.deleteHead());
	}
}
