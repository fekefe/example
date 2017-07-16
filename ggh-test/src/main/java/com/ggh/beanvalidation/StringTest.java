package com.ggh.beanvalidation;

/**
 * Created by Administrator on 2016/12/27.
 */
public class StringTest {

	int t ;


	public static void main(String[] args) {


		String a = "abcde";
		String b = "abc" + "de";
		String e = new String("abcde");
		final String d = "abcde";
		String f = "abc" + new String("de");
		String g = "de";
		String h = "abc" + g;

		StringTest t= new StringTest();

		System.out.println(a == b);
		System.out.println(a == e);
		System.out.println(a == d);
		System.out.println(a == f);
		System.out.println(a == h);
		System.out.println(t.t);
	}


	/**
	 * 几次方
	 */
	private int x = 10;
	private int n = 3;
	int foo(int a) {
		if (n > 1) {
			n--;
			a = a * x;
			a = foo(a);
		}
		return a;
	}

	@org.junit.Test
	public void ttt(){
		int ab = foo(x);
		System.out.println(ab);
	}



}
