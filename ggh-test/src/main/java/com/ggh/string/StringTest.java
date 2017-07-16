package com.ggh.string;

import org.junit.Test;

/**
 * Created by gaoquan on 2017/3/25.
 */
public class StringTest {

	@Test
	public void ObjectCountTest() {
		String a, b, c;
		a = "test";
		b = a;
		c = b;
		System.out.println(a==c);
	}
}
