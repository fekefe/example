package com.algorithm.example;

import java.util.PriorityQueue;

/**
 * 数据流中第K大元素
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/11/19
 */
public class KthLargest {
	
	
	int k;
	// 优先队列
	PriorityQueue<Integer> queue;
	
	public KthLargest(int count, int[] nums) {
		k = count;
		queue = new PriorityQueue<>();
		if (nums.length <= count) {
			for (int ele : nums) {
				queue.add(ele);
			}
		} else {
			for (int i = 0; i < count; i++) {
				queue.add(nums[i]);
			}
			for (int i = count; i < nums.length; i++) {
				if (queue.peek() < nums[i]) {
					queue.poll();
					queue.add(nums[i]);
				}
			}
		}
	}
	
	public int add(int val) {
		if (queue.size() < k) {
			queue.offer(val);
		} else if (queue.peek() < val) {
			queue.poll();
			queue.offer(val);
		}
		return queue.peek();
	}
	
	/**
	 * int k = 3;
	 * int[] arr = [4,5,8,2];
	 * KthLargest kthLargest = new KthLargest(3, arr);
	 * kthLargest.add(3);   // returns 4
	 * kthLargest.add(5);   // returns 5
	 * kthLargest.add(10);  // returns 5
	 * kthLargest.add(9);   // returns 8
	 * kthLargest.add(4);   // returns 8
	 * @param args
	 */
	public static void main(String[] args) {
		int k = 3;
		int[] nums = {4, 5, 8, 2};
		
		KthLargest kthLargest = new KthLargest(k, nums);
		
		System.out.println(kthLargest.add(3));
		System.out.println(kthLargest.add(5));
		System.out.println(kthLargest.add(10));
		System.out.println(kthLargest.add(9));
		System.out.println(kthLargest.add(4));
		
	}
	
	
}

