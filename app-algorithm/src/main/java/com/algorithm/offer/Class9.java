package com.algorithm.offer;

import org.junit.Test;

/**
 * 写一个函数，输入n，求斐波那契数列的第n项。
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class9 {
/*
1	1	1
2	1	1
3	2	0
4	3	1
5	5	1
6	8	0
7	13	1
8	21	1
9	34	0
10	55	1
11	89	1
12	144	0
 */
	int n = 40;

	@Test
	public void test1() {
		System.out.println(this.generateFibonacci(n));
	}
	
	@Test
	public void test2() {
		System.out.println(this.fibonacci(n));
	}
	
	private long generateFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return generateFibonacci(n - 1) + generateFibonacci(n - 2);
	}
	
	private long fibonacci(int n) {
		int[] result = {0, 1};
		if (n < 2) {
			return result[n];
		}
		int one = 1;
		int two = 0;
		int temp = 0;
		for (int i = 2; i <= n; i++) {
			temp = two + one;
			two = one;
			one = temp;
		}
		return temp;
	}
}


