package com.algorithm.offer;


import org.junit.Test;

/**
 * 合并两个排序的链表
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class17 {
	
	@Test
	public void test1() {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = new LinkNode(5);
		LinkNode node6 = new LinkNode(6);
		node1.next = node3;
		node3.next = node5;
		node5.next = null;
		
		node2.next = node4;
		node4.next = node6;
		node6.next = null;
		
		print(node1);
		print(node2);
		print(mergeA(node1, node2));
	}
	
	@Test
	public void test2() {
		LinkNode node1 = new LinkNode(1);
		LinkNode node2 = new LinkNode(2);
		LinkNode node3 = new LinkNode(3);
		LinkNode node4 = new LinkNode(4);
		LinkNode node5 = new LinkNode(5);
		LinkNode node6 = new LinkNode(6);
		node1.next = node3;
		node3.next = node5;
		node5.next = null;
		
		node2.next = node4;
		node4.next = node6;
		node6.next = null;
		
		print(node1);
		print(node2);
		print(mergeB(node1, node2));
	}
	
	private static void print(LinkNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
	
	/**
	 * 递归方法：调用自身进行比较合并，消耗内存。
	 */
	public LinkNode mergeA(LinkNode head1, LinkNode head2) {
		if (head1 == null) return head2;
		if (head2 == null) return head1;
		// 记录合并链表
		LinkNode node = null;
		if (head1.val > head2.val) {
			node = head2;
			node.next = mergeA(head1, head2.next);
		} else {
			node = head1;
			node.next = mergeA(head1.next, head2);
		}
		return node;
	}
	
	/**
	 * 非递归方法：消耗内存少。
	 */
	public LinkNode mergeB(LinkNode head1, LinkNode head2) {
		if (head1 == null) return head2;
		if (head2 == null) return head1;
		LinkNode tempNode = new LinkNode(-1);
		// 记录合并链表
		LinkNode node = tempNode;
		while (head1 != null && head2 != null) {
			if (head1.val < head2.val) {
				node.next = head1;
				head1 = head1.next;
			} else {
				node.next = head2;
				head2 = head2.next;
			}
			node = node.next;
		}
		if (head1 != null) {
			node.next = head1;
		}
		if (head2 != null) {
			node.next = head2;
		}
		return tempNode.next;
	}
}
