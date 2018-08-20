package com.ggh.numtest;

import org.junit.Test;

/**
 * @author gaoquan on 2018/2/12
 */
public class LongTest {
	
	@Test
	public void test1() {
		System.out.println("-129:");
		Integer a = -129;
		Integer b = -129;
		System.out.println(a == b);
		System.out.println(a.intValue() == b.intValue());
		System.out.println();
		
		System.out.println("-128:");
		Integer c = -128;
		Integer d = -128;
		System.out.println(c == d);
		System.out.println(c.intValue() == d.intValue());
		System.out.println();
		
		System.out.println("127:");
		Integer e = 127;
		Integer f = 127;
		System.out.println(e == f);
		System.out.println(e.intValue() == f.intValue());
		System.out.println();
		
		System.out.println("128:");
		Integer g = 128;
		Integer h = 128;
		System.out.println(g == h);
		System.out.println(g.intValue() == h.intValue());
		System.out.println();
		
		
		
	}
}
