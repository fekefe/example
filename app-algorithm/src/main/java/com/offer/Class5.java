package com.offer;

import java.util.Stack;

/**
 * 题目描述剑指offer面试题5：从尾到头打印链表
 * 输入一个链表的头结点，从尾到头打印出每个结点的值
 * @author ggh on 2018/1/8
 */
public class Class5 {
	
	// 解决方案一：首先遍历链表的节点后打印，典型的“后进先出”，可以使用栈来实现这种顺序。
	// 解决方案二：栈的本质就是递归，直接使用递归的方式，打印一个节点的时候先打印它后面的节点，再打印该节点自身，实现反向打印
	// 解决方案三：遍历链表，把链表中的元素复制到ArrayList中，然后逆序打印ArrayList中的元素，由于ArrayList底层使用数组实现，所以用数组也是同样的原理
	// 解决方案四：前三种解决方案本身属于在打印链表的时候不修改链表本身结构，在允许修改链表结构的情况下可以把链表中的节点指针反转过来，改变链表方向，然后重新遍历打印改变方向后的链表。
	
	
	public static void main(String[] args) {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = null;
		LinkNode node6 = new LinkNode(6);
		LinkNode node7 = new LinkNode();
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		
		// test1(node1);
		// test2(node1);
		// print(test3(node1));
		print(test4(node1));
		
	}
	
	private static void print(LinkNode node) {
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	/**
	 * 放入栈
	 * 解决方案一：首先遍历链表的节点后打印，典型的“后进先出”，可以使用栈来实现这种顺序。
	 */
	private static void test1(LinkNode node) {
		Stack<Integer> stack = new Stack<>();
		while (node != null) {
			stack.push(node.val);
			node = node.next;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	
	/**
	 * 递归翻转打印
	 * 解决方案二：栈的本质就是递归，直接使用递归的方式，打印一个节点的时候先打印它后面的节点，再打印该节点自身，实现反向打印
	 */
	private static void test2(LinkNode node) {
		if (node == null) {
			return;
		}
		if (node.next != null) {
			test2(node.next);
		}
		System.out.println(node.val);
	}
	
	/**
	 * 递归翻转链表
	 * 解决方案四：前三种解决方案本身属于在打印链表的时候不修改链表本身结构，在允许修改链表结构的情况下可以把链表中的节点指针反转过来，改变链表方向，然后重新遍历打印改变方向后的链表。
	 */
	private static LinkNode test3(LinkNode node) {
		if (node == null || node.next == null) {
			return node;
		}
		LinkNode nodeHead = test3(node.next);
		node.next.next = node;
		node.next = null;
		return nodeHead;
	}
	
	/**
	 * 循环翻转链表，两个链表完成
	 * 解决方案四：前三种解决方案本身属于在打印链表的时候不修改链表本身结构，在允许修改链表结构的情况下可以把链表中的节点指针反转过来，改变链表方向，然后重新遍历打印改变方向后的链表。
	 * null   A > B > C
	 * null < A   B > C
	 * null < A < B   C
	 */
	private static LinkNode test4(LinkNode node) {
		LinkNode newNode = null;
		if (node == null || node.next == null) {
			return node;
		}
		while (node != null) {
			LinkNode tempNode = node.next;
			node.next = newNode;
			newNode = node;
			node = tempNode;
		}
		return newNode;
	}
}
