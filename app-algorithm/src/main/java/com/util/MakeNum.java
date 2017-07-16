package com.util;

/**
 * 造测试数字
 */
public class MakeNum {
	/**
	 * The The array.
	 */
	public long[] theArray;// = { 77, 99, 44, 55, 22, 88, 11, 00, 66, 33 };
	private int nElems;

	/**
	 * Instantiates a new Make num.
	 *
	 * @param maxSize the max size
	 */
	public MakeNum(int maxSize) {
		theArray = new long[maxSize];
		nElems = 0;
		for (int i = 0; i < maxSize; i++) {
			long t = (int) (Math.random() * maxSize);
			insert(t);
		}
	}

	public MakeNum(int maxSize, int maxNum) {
		theArray = new long[maxSize];
		nElems = 0;
		for (int i = 0; i < maxSize; i++) {
			long t = (int) (Math.random() * maxNum);
			insert(t);
		}
	}

	/**
	 * 插入
	 *
	 * @param value value
	 */
	private void insert(long value) {
		theArray[nElems] = value;
		nElems++;
	}

	/**
	 * 遍历打印数据
	 *
	 * @param t the t
	 */
	public void display(long[] t) {
		for (int j = 0; j < nElems; j++) {
			System.out.print(t[j] + " ");
		}
		System.out.println();
	}


	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(theArray[j] + " ");
		}
		System.out.println();
	}
}
