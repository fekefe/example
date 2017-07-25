package com.algorithm.merge;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 两个数组的交集
 *
 * @author gaoquan on 2017/7/25.
 */
public class MergeArrayTest1 {


	@Test
	public void testArrayIntersectionA() {
		int[] arrayA = new int[]{1, 1, 2, 3, 4, 4, 5, 1, 1};
		int[] arrayB = new int[]{11, 1, 22, 3, 43, 4, 5, 11, 1, 22};

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arrayA.length; i++) {
			for (int j = 0; j < arrayB.length; j++) {
				if (arrayA[i] == arrayB[j]) {
					set.add(arrayA[i]);
				}
			}
		}
		System.out.println(set);
	}

	@Test
	public void intersectionMain() {
		// int[] arrayA = new int[]{1, 1, 2, 3, 4, 4, 5};
		// int[] arrayB = new int[]{1, 3, 22, 43};

		int[] arrayA = new int[]{1, 1, 2, 3, 4, 4, 5, 1, 1};
		int[] arrayB = new int[]{11, 1, 22, 3, 43, 4, 5, 11, 1, 22};
		Arrays.sort(arrayA);
		Arrays.sort(arrayB);

		intersectionA(arrayA, arrayB);
	}

	public void intersectionA(int[] A, int[] B) {
		if (A == null || B == null || A.length == 0 || B.length == 0) {
			return;
		}
		int[] c = new int[A.length];
		int pointerA = 0;
		int pointerB = 0;
		int cIndex = 0;
		while (pointerA < A.length && pointerB < B.length) {
			if (A[pointerA] < B[pointerB]) pointerA++;
			else if (A[pointerA] > B[pointerB]) pointerB++;
			else {
				c[cIndex] = A[pointerA];
				cIndex++;
				pointerA++;
				pointerB++;
			}
		}
		System.out.println(cIndex);
		System.out.println(Arrays.toString(c));
	}


}
