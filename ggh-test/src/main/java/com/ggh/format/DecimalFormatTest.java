package com.ggh.format;

import org.junit.Test;

import java.text.DecimalFormat;


/**
 * @author gaoquan on 2017/8/3.
 */
public class DecimalFormatTest {

	@Test
	public void test1(){
		int num = 1234567890;
		System.out.println(new DecimalFormat(",###").format(num));
	}
}
