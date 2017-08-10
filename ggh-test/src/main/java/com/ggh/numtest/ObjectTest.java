package com.ggh.numtest;

import org.junit.Test;

/**
 * @author gaoquan on 2017/8/7.
 */
public class ObjectTest {

	@Test
	public void test1() {
		Long a1 = new Long(1024L);
		Long a2 = new Long(1024L);
		System.out.println(a1 == a2);

		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);

		Integer i3 = 1000;
		Integer i4 = 1000;
		System.out.println(i3 == i4);
	}


	@Test
	public void test2() {
		int i1 = 100;
		Integer i2 = 1000;
		float i = i1 / (float) i2;
		System.out.println(i);

	}
}
