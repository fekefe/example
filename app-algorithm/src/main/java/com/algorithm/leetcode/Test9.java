package com.algorithm.leetcode;

import org.junit.Test;

/**
 * @author gaoquan on 2018/2/14
 */
public class Test9 {
	public boolean isPalindrome(int x) {
		int length = 0;
		int count = 2;
		boolean flag = false;
		while (count >= length) {
			int i1 = (x % (int) Math.pow(10, length)) / (10 * (int) Math.pow(10, length));
			int i2 = (x / (int) Math.pow(10, length)) % 10;
			if (i1 == i2) {
				flag = true;
				count--;
				length++;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public boolean d(int x) {
		int a = 0, b = x;
		while (b > 0) {
			a = a * 10 + b % 10;
			b /= 10;
		}
		if (a == x)
			return true;
		else
			return false;
	}
	
	@Test
	public void test() {
		int ints = 121;
		System.out.println(this.isPalindrome(ints));
		
		
	}
}
