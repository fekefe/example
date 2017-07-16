package com.algorithm.merge;

import com.util.MakeNum;
import org.junit.Test;

/**
 * 最小字数组
 * <p>
 * 右边的数字减去左面的数字，所得最大的值
 *
 * @author gaoquan on 2017/7/13.
 */
public class MergeTest {

	public long[] theArray = {77, 99, 44, 55, 22, 88, 11, 66, 33};
	// public long[] theArray = {3, 8, 5, 1, 7, 8};

	@Test
	public void portal() {
		int random = (int) (Math.random() * 10) + 5;
		MakeNum makeNum = new MakeNum(random, 100);
		makeNum.display();
	}

	@Test
	public void portal1() {
		this.doSomething(theArray);
	}


	private void doSomething(long[] a) {
		long curNum = 0L;
		long sum1 = 0L, sum2 = 0L, sum3 = 0L;
		long maxNum = 0L;

		int minIdx = 0, maxIdex = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				long a1 = a[i];
				long a2 = a[j];

				curNum = a2 - a1;
				if (curNum > maxNum) {
					maxNum = curNum;
					minIdx = i;
					maxIdex = j;
				}
			}
		}


		curNum = 0L;
		for (int i = 0; i < minIdx; i++) {
			for (int j = i + 1; j < minIdx; j++) {
				long a1 = a[i];
				long a2 = a[j];

				curNum = a2 - a1;
				if (curNum > sum1) {
					sum1 = curNum;
				}
			}
		}

		curNum = 0L;
		for (int i = minIdx; i < maxIdex; i++) {
			for (int j = i + 1; j < maxIdex; j++) {
				long a1 = a[i];
				long a2 = a[j];

				curNum = a1 - a2;
				if (curNum > sum2) {
					sum2 = curNum;
				}
			}
		}

		curNum = 0L;
		for (int i = maxIdex; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				long a1 = a[i];
				long a2 = a[j];

				curNum = a2 - a1;
				if (curNum > sum3) {
					sum3 = curNum;
				}
			}
		}
		System.out.println(maxNum + " " + minIdx + " " + maxIdex);
		System.out.println(sum1 + " " + sum2 + " " + sum3);

		long sum = sum1;
		if (sum < sum2) {
			sum = sum2;
		}
		if (sum < sum3) {
			sum = sum3;
		}
		System.out.println(maxNum + sum);
	}

}
