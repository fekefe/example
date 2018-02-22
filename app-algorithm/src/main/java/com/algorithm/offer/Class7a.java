package com.algorithm.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列实现一个栈
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class7a {
	/*
	解题思路：根据栈的先入后出和队列的先入先出的特点
1.在push的时候，把元素向非空的队列内添加
2.在pop的时候，把不为空的队列中的size()-1份元素poll出来，添加到另为一个为空的队列中，再把队列中最后的元素poll出来
两个队列在栈不为空的情况下始终是有一个为空，另一个不为空的。push添加元素到非空的队列中，pop把非空队列的元素转移到另一个空的队列中，直到剩下最后一个元素，这个元素就是要出栈的元素（最后添加到队列中的元素）
	 */
	
	private Queue<Object> queue1 = new LinkedList<>();
	private Queue<Object> queue2 = new LinkedList<>();
	
	
	public void push(Object obj) {
		if (!queue1.isEmpty()) {
			queue1.offer(obj);
		} else {
			queue2.offer(obj);
		}
	}
	
	public Object pop() {
		Object dom = null;
		if (!queue1.isEmpty() || !queue2.isEmpty()) {
			if (queue1.isEmpty()) {
				while (queue2.size() > 1) {
					queue1.offer(queue2.poll());
				}
				dom = queue2.poll();
			} else {
				while (queue1.size() > 1) {
					queue2.offer(queue1.poll());
				}
				dom = queue1.poll();
			}
		}
		return dom;
	}
	
	public static void main(String[] args) {
		Class7a class7a = new Class7a();
		class7a.push(1);
		class7a.push(2);
		class7a.push(3);
		class7a.push(4);
		class7a.push(5);
		
		System.out.println(class7a.pop());
		System.out.println(class7a.pop());
		System.out.println(class7a.pop());
		System.out.println(class7a.pop());
		System.out.println(class7a.pop());
	}
	
}
