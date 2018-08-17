package com.algorithm.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gaoquan on 2018/2/13
 */
public class Test1 {
	
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int temp = target - nums[i];
			if (map.containsKey(temp)) {
				return new int[]{map.get(temp), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	@Test
	public void test() {
		// int[] nums = {2, 7, 11, 15};
		int[] nums = {3, 2, 4};
		int[] ints = this.twoSum(nums, 6);
		System.out.println(ints[0]);
		System.out.println(ints[1]);
	}
	
	
}
