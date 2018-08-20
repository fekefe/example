package com.algorithm.leetcode;

import org.junit.Test;

/**
 * @author gaoquan on 2018/2/13
 */
public class Test7 {
	
	public int reverse(int x) {
		if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE) {
			return 0;
		}
		int temp = 0;
		int flag = 1;
		if (x < 0) {
			flag = -1;
			x = -x;
		}
		while (x > 0) {
			if ((long) temp * 10 >= Integer.MAX_VALUE) {
				return 0;
			}
			temp = temp * 10 + x % 10;
			x = x / 10;
		}
		return flag * temp;
	}
	
	@Test
	public void test() {
		int ints = this.reverse(-1236);
		// int ints = this.reverse(1534236469);
		System.out.println(ints);
	}
	
}
