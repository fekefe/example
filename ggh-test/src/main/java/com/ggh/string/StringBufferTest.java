package com.ggh.string;

import org.junit.Test;

/**
 * Created by gaoquan on 2017/3/25.
 */
public class StringBufferTest {

	/**
	 * StringBuffer Object count
	 * StringBuffer对象个数多少
	 */
	@Test
	public void ObjectCountTest1() {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");
		operate(a, b);
		System.out.println(a + "," + b);
	}

	/**
	 * StringBuffer Object count
	 * StringBuffer对象个数多少
	 */
	@Test
	public void ObjectCountTest2() {
		String A, B, C;
		A = "a";
		B = "b";
		A = A + B;
		StringBuffer D = new StringBuffer("abc");
		D.append("567");
		System.out.println();
	}


	/**
	 * Operate.
	 *
	 * @param x the x
	 * @param y the y
	 */
	void operate(StringBuffer x, StringBuffer y) {
		x.append(y);
		y = x;
	}
}
