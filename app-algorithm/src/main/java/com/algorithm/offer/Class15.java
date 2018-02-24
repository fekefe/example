package com.algorithm.offer;

import org.junit.Test;

/**
 * 链表中倒数第K个节点
 * 题目：输入一个链表，输出该链表的倒数第K个节点。为了符合大多数人的习惯，本题从1开始计数，
 * 即链表尾节点是倒数第一个节点。
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class15 {
	
	
	/*
	A   B   C   D   E   F   G   H   I   J
	        ↑
	        P1
	--------------------------------------
	A   B   C   D   E   F   G   H   I   J
    ↑      ↑
	P2      P1
	--------------------------------------
	A   B   C   D   E   F   G   H   I   J
							    ↑      ↑
								P2      P1

	两个指针，第二个指针不动，第一指针走K-1
	两个指针同时走，第一个指针走到最后时候，第二个指针指向的是K
	 */
	
	@Test
	public void app() {
		int value = 9;
		LinkNode a = new LinkNode(value--, null);
		LinkNode b = new LinkNode(value--, a);
		LinkNode c = new LinkNode(value--, b);
		LinkNode d = new LinkNode(value--, c);
		LinkNode e = new LinkNode(value--, d);
		LinkNode f = new LinkNode(value--, e);
		LinkNode g = new LinkNode(value--, f);
		LinkNode h = new LinkNode(value--, g);
		LinkNode head = new LinkNode(value--, h);
		
		print(head);
		System.out.println(findKthToTail(head, 3).val);
	}
	
	private static void print(LinkNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static LinkNode findKthToTail(LinkNode head, int k) {
		LinkNode ahead = head;
		LinkNode behind = null;
		for (int i = 0; i < k - 1; i++) {
			ahead = ahead.next;
		}
		behind = head;
		while (ahead.next != null) {
			ahead = ahead.next;
			behind = behind.next;
		}
		return behind;
	}
	
}
