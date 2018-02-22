package com.algorithm.offer;

import org.junit.Test;

/**
 * 打印1到最大的n位数
 * 题目：打印1到最大的n位数，输入数字n,按顺序打印输出从1到最大的n位十进制数，比如输入3，打印从1到999.
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/1/25
 */
public class Class12 {
	
	@Test
	public void test1() {
		print1(2);
	}
	
	public void print1(int n) {
		int max = 1;
		for (int i = 1; i <= n; i++) {
			max = max * 10;
		}
		System.out.println(max);
		for (int i = 1; i < max; ) {
			System.out.println(i);
			System.out.println(i + 1);
			System.out.println(i + 2);
			i = i + 3;
		}
	}
	
	@Test
	public void test2() {
		print2(2);
	}
	
	public void print2(int n) {
		if (n <= 0) {
			return;
		}
		StringBuffer number = new StringBuffer();
		for (int i = 0; i < n; i++) {
			number.append('0');
			
		}
		while (!increment(number)) {
			printNumber(number);
		}
	}
	
	private boolean increment(StringBuffer s) {
		boolean isOverflow = false;
		int nTakeOver = 0;
		int nLength = s.length();
		for (int i = nLength - 1; i >= 0; i--) {
			int nSum = s.charAt(i) - '0' + nTakeOver;
			if (i == nLength - 1) {
				nSum++;
			}
			if (nSum >= 10) {
				if (i == 0) {
					isOverflow = true;
				} else {
					nSum -= 10;
					nTakeOver = 1;
					s.setCharAt(i, (char) ('0' + nSum));
				}
			} else {
				s.setCharAt(i, (char) ('0' + nSum));
				break;
			}
		}
		return isOverflow;
	}
	
	private void printNumber(StringBuffer s) {
		boolean isBeginning0 = true;
		for (int i = 0; i < s.length(); i++) {
			if (isBeginning0 && s.charAt(i) != '0') {
				isBeginning0 = false;
			}
			if (!isBeginning0) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}
}
