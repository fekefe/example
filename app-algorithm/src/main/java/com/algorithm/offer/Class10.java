package com.algorithm.offer;

import org.junit.Test;

/**
 * 二进制中1的个数
 * 题目：请实现一个函数，输入一个整数，输出该整数二进制表示中1的个数。例如，把9表示成二进制是1001，有2位是1，该函数输出2
 * @author gaoquan on 2018/1/25
 */
public class Class10 {
	/*
	解法：把整数减一和原来的数做与运算，会把该整数二进制表示中的最低位的1变成0,与运算进行多少次就有多少个1。
	 */
	
	int n = 20;
	
	@Test
	public void test1() {
		System.out.println(number(n));
	}
	
	private int number(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num & (num - 1);
			
			// 20		19
			//10100  10011
			// 15		14
			//10000   1111
		}
		return count;
	}
}
