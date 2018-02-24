package com.algorithm.offer;

/**
 * 调整数组顺序使奇数位于偶数之前
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数组的顺序，使得所有的奇数位于数组的前半部分，偶数位于数组的后半部分。
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class14 {
	/*
	输入一个整数数组，实现一个函数来调整该数组中数组的顺序，
	使得所有的奇数位于数组的前半部分，偶数位于数组的后半部分。

	解题思路：数组中维护两个指针，
	第一个指针初始化时候指向数组头部，第二个指针初始化时候指向数组尾部，
	第一个指针指向的数字总是偶数，第二个指针指向的数字总是奇数，
	如果第一个指针在第二个指针之前，则交换两指针指向的元素。
	 */
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		reorderOddEven(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		
	}
	
	public static void reorderOddEven(int[] array) {
		int begin = 0;
		int end = array.length - 1;
		while (begin < end) {
			while (begin < end && (array[begin] & 1) != 0)
				begin++;
			while (begin < end && (array[end] & 1) == 0)
				end--;
			if (begin < end) {
				int temp = array[begin];
				array[begin] = array[end];
				array[end] = temp;
			}
		}
	}
}
