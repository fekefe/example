package com.ggh.string;

import org.junit.Test;

/**
 * 对象比较
 * 
 * Created by gaoquan on 2017/3/25.
 */
public class StringObjectTest {

	@Test
	public void ObjectCountTest() {
		String a, b, c;
		a = "test";
		b = a;
		c = b;
		System.out.println(a == c);
	}
}
