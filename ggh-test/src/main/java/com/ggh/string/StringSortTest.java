package com.ggh.string;

import org.junit.Test;

/**
 * 倒序排列
 *
 * @author gaoquan on 2017/7/31.
 */
public class StringSortTest {

	@Test
	public void Test1() {
		String str = "abcdefg";
		int length = str.length() - 1;
		String t = "";
		for (; length >= 0; length--)
			t += str.charAt(length);
		System.out.println(t);
	}

	@Test
	public void Test2() {
		String str = "abcdefg";
		char[] chars = str.toCharArray();
		int length = chars.length - 1;
		String t = "";
		for (; length >= 0; length--)
			t += chars[length];
		System.out.println(t);
	}
}
