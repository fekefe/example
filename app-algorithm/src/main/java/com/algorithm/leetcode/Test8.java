package com.algorithm.leetcode;

import org.junit.Test;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/2/13
 */
public class Test8 {
	public int myAtoi(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		int count = 0;
		int base = 0;
		int sign = 1;
		while (count < str.length() && str.charAt(count) == ' ') {
			count++;
		}
		if (str.charAt(count) == '-' || str.charAt(count) == '+') {
			sign = str.charAt(count) == '-' ? -1 : 1;
			count++;
		}
		while (count < str.length() && str.charAt(count) >= '0' && str.charAt(count) <= '9') {
			if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(count) - '0' > 7)) {
				if (sign == 1) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}
			base = base * 10 + (str.charAt(count) - '0');
			count++;
		}
		return base * sign;
	}
	
	public int old(String str) {
		int length = str.length();
		int count = 0;
		long temp = 0;
		int flag = 1;
		char[] chars = str.toCharArray();
		while ((count < length) && (chars[count] <= ' ')) {
			count++;
		}
		boolean firstFlag = false;
		while (count < length) {
			Character c = str.charAt(count);
			String charStr = c.toString();
			if (!charStr.matches("[0-9]")) {
				if (firstFlag) {
					break;
				}
				if ("-".equals(charStr)) {
					firstFlag = true;
					flag = -1;
					count++;
					continue;
				} else if ("+".equals(charStr)) {
					firstFlag = true;
					count++;
					continue;
				} else {
					break;
				}
			} else {
				firstFlag = true;
			}
			temp = temp * 10 + Integer.parseInt(charStr);
			if (flag * temp >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			} else if (flag * temp <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
			count++;
		}
		return (int) (temp * flag);
	}
	
	@Test
	public void test() {
		String a = "-1236";
		a = "+-1236";
		// a = "";
		a = "2147483648";
		a = "+1";
		a = " 123a1";
		a = "   b11228552307";
		a = "";
		int ints = this.myAtoi(a);
		// // int ints = this.reverse(1534236469);
		System.out.println(ints);
		
		// System.out.println(Integer.parseInt("+-2"));
		
	}
	
	
}
