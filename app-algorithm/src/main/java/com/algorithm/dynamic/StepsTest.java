package com.algorithm.dynamic;

import org.junit.Test;

/**
 * @author gaoquan on 2017/7/31.
 */
public class StepsTest {

	public int[] A = new int[100];

	public int f3(int n) {
		if (n <= 2) {
			A[n] = n;
		}
		if (A[n] > 0) {
			return A[n];
		} else {
			A[n] = f3(n - 1) + f3(n - 2);
			return A[n];
		}
	}

	@Test
	public void f3Test() {
		int n = 3;
		int i = f3(n);
		System.out.println(i);
	}

}
