package com.algorithm.example.dynamic;

import org.junit.Test;

/**
 * 动态规划
 * @author gaoquan on 2017/7/31.
 */
public class StepsTest {
	
	private int[] array = new int[100];
	
	/**
	 * 第一个数时1，返回指定位置的数，等于前两个数的和
	 * Calculate int.
	 * @param num the num
	 * @return int
	 */
	private int calculate(int num) {
		if (num <= 2) {
			array[num] = num;
		}
		if (array[num] > 0) {
			return array[num];
		} else {
			array[num] = calculate(num - 1) + calculate(num - 2);
			return array[num];
		}
	}
	
	@Test
	public void f3Test() {
		int num = 11;
		int count = calculate(num);
		System.out.println(count);
	}
	
}
