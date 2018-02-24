package com.algorithm.offer;

/**
 * O(1)时间内删除链表节点
 * 题目：给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间删除该节点。
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class13 {
	/*
	由于给定的是单向链表，正常删除链表的时间复杂度是查找链表的时间复杂度即O(n),
	如果要求在O(1)时间复杂度内删除节点，通过遍历链表找到该节点的上一节点和下一节点的方法是行不通了。
	所以实现的思路是，根据给定的要删除的节点，可以直接找到其后年的节点，把后面的节点的内容复制到当前节点处，
	同时将当前节点指向其后面节点的后面节点保证链表不断开，再把下一节点删掉就相当于把给定的节点删除了。

	需要考虑到的一点是，如果要删除的节点是链表的尾节点的话，那还是需要从头结点按照顺序遍历到尾节点的前一节点，
	然后删除尾节点，总的平均时间复杂度就是[(n-1)*1+O(n)]/n,结果还是O(1)。
	 */
	
	
	public static void main(String[] args) {
		LinkNode tail = new LinkNode(1, null);
		LinkNode c = new LinkNode(2, tail);
		LinkNode b = new LinkNode(3, c);
		LinkNode head = new LinkNode(4, b);
		
		print(head);
		deleteNode(head, c);
		print(head);
		
	}
	
	public static void deleteNode(LinkNode head, LinkNode node) {
		//删除尾节点，采用顺序查找找到尾节点的前一节点
		if (node.next == null) {
			while (head.next != node) {
				head = head.next;
			}
			head.next = null;
		}
		//要删除的节点是头结点
		else if (head == node) {
			head = null;
		}
		//要删除的节点是中间普通节点
		else {
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}
	
	
	private static void print(LinkNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println();
	}
	
}
