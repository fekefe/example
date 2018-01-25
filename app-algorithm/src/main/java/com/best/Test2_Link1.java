package com.best;

import com.best.base.Link;

/**
 * 打印两个有序链表公共部分
 * -------------
 * 给定两个有序链表的头指针head1和head2，
 * 打印两个链表的公共部分
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/24
 */
public class Test2_Link1 {
	
	public void test(Link link1, Link link2) {
		while (link1 != null && link2 != null) {
			if (link1.val > link2.val) {
				link2 = link2.next;
			} else if (link1.val < link2.val) {
				link1 = link1.next;
			} else if (link1.val == link2.val) {
				System.out.println(link1.val);
				link1 = link1.next;
				link2 = link2.next;
			}
		}
	}
}
