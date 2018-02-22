package com.algorithm.offer;

/**
 * 有两个排序的数组A1和A2，内存在A1的末尾有足够多的空余空间容纳A2.
 * 请实现一个函数，把A2中的所有数字插入到A1中并且所有的数字是排序的。
 * 还是利用从后向前比较两个数组中的数字的方式来实现。
 * @author ggh on 2018/1/8
 */
public class Class4a {
	
	
	public static void main(String[] args) {
		int[] array1 = {4, 5, 6, 7, 8, 10};
		int[] array2 = {1, 2, 3, 4, 5};
		
		for (int i : temp(array1, array2)) {
			System.out.println(i);
		}
	}
	
	
	private static int[] temp(int[] array1, int[] array2) {
		int[] temp = new int[array1.length + array2.length];
		int i = array1.length - 1;
		int j = array2.length - 1;
		int n = array1.length + array2.length - 1;
		while (n >= 0) {
			if (i >= 0 && j >= 0) {
				if (array1[i] > array2[j]) {
					temp[n] = array1[i];
					n--;
					i--;
				} else if (array1[i] < array2[j]) {
					temp[n] = array2[j];
					n--;
					j--;
				} else if (array1[i] == array2[j]) {
					temp[n] = array1[i];
					temp[n - 1] = array2[j];
					n = n - 2;
					i--;
					j--;
				}
			} else {
				if (i >= 0) {
					temp[n--] = array1[i--];
				}
				
				if (j >= 0) {
					temp[n--] = array2[j--];
				}
			}
		}
		
		return temp;
	}
}
