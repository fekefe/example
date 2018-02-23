package com.algorithm.offer;

import org.junit.Test;

/**
 * 反转链表
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class16 {
	
	@Test
	public void test1() {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = new LinkNode(5);
		LinkNode node6 = new LinkNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		node5.next = node6;
		node6.next = null;
		
		print(node1);
		print(reverseA(node1));
	}
	
	@Test
	public void test2() {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = new LinkNode(5);
		LinkNode node6 = new LinkNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		node5.next = node6;
		node6.next = null;
		
		print(node1);
		print(reverseB(node1));
	}
	
	private static void print(LinkNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	/**
	 * 递归翻转链表
	 * A > B > C   null
	 * A > B   null < C
	 * A   null < B < C
	 * null < A < B < C
	 */
	private static LinkNode reverseA(LinkNode node) {
		if (node == null || node.next == null) {
			return node;
		}
		LinkNode headNode = reverseA(node.next);
		node.next.next = node;
		node.next = null;
		return headNode;
	}
	
	/**
	 * 循环翻转链表，两个链表完成
	 * null   A > B > C
	 * null < A   B > C
	 * null < A < B   C
	 * null < A < B < C
	 */
	private static LinkNode reverseB(LinkNode node) {
		if (node == null || node.next == null) {
			return node;
		}
		LinkNode headNode = null;
		while (node != null) {
			LinkNode tempNode = node.next;
			node.next = headNode;
			headNode = node;
			node = tempNode;
		}
		return headNode;
	}
	
	
}
