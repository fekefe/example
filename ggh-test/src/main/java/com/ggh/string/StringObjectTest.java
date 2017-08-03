package com.ggh.string;

import org.junit.Test;

/**
 * 对象比较
 * <p>
 * Created by gaoquan on 2017/3/25.
 */
public class StringObjectTest {

	int t;

	@Test
	public void ObjectCountTest() {
		String a1, b1, c1;
		a1 = "test";
		b1 = a1;
		c1 = b1;

		System.out.println(a1 == c1);

		String a = "abcde";
		String b = "abc" + "de";
		String e = new String("abcde");
		final String d = "abcde";
		String f = "abc" + new String("de");
		String g = "de";
		String h = "abc" + g;

		System.out.println(a == b);
		System.out.println(a == e);
		System.out.println(a == d);
		System.out.println(a == f);
		System.out.println(a == h);
		System.out.println(t);
	}


}
