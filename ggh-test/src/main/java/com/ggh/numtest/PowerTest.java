package com.ggh.numtest;

import org.junit.Test;

/**
 * @author gaoquan on 2017/8/3.
 */
public class PowerTest {


	/**
	 * 几次方
	 */
	int foo(int x, int n) {
		int a = x;
		if (n == 0) {
			return 0;
		}
		n--;
		while (n-- > 0) {
			a = a * x;
		}
		return a;
	}

	@Test
	public void Power() {
		System.out.println(foo(2, 3));
	}

	@Test
	public void PowerMethod() {
		System.out.println(Math.pow(2, 3));
	}
}
