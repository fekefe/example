package com.ggh.map;

import org.junit.Test;

import java.util.BitSet;

/**
 * BitMap的实现
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/10/19
 */
public class BitSetTest {
	
	@Test
	public void test1() {
		int[] array = new int[]{1, 2, 3, 22, 0, 3};
		BitSet bitSet = new BitSet();
		//将数组内容组bitmap
		for (int i = 0; i < array.length; i++) {
			bitSet.set(array[i], true);
		}
		System.out.println(bitSet.size());
		System.out.println(bitSet.get(3));
		System.out.println(bitSet.get(100));
		
		bitSet.set(65, true);
		
		System.out.println(bitSet.size());
		System.out.println(bitSet.get(65));
	}
	
}
