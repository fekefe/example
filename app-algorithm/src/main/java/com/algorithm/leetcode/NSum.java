package com.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和，三数之和，四数之和，n数之和
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/10/29
 */
public class NSum {
	
	public void twoSumTest() {
	
	}
	
	/**
	 * （leetcode1）给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
	 */
	private int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	/**
	 * (leetcode167)给定一个已按照升序排列的有序数组，找到两个数使得它们相加之和等于目标数。函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
	 * 二分查找
	 * [2, 7 ,11 ,15 ,17] 取18
	 * left = 0, right = array.length-1
	 * 2 + 17 = 19 right--
	 * 2 + 15 = 17 left++
	 * 7 + 15 = 23 right--
	 * 7 + 11 = 18
	 */
	private int[] twoSumSort(int[] numbers, int target) {
		int[] result = new int[2];
		int len = numbers.length;
		int left = 0;
		int right = len - 1;
		while (left < right) {
			int value = numbers[left] + numbers[right];
			if (value == target) {
				result[0] = left + 1;
				result[1] = right + 1;
				break;
			} else if (value > target) {
				right--;
			} else {
				left++;
			}
		}
		return result;
	}
	
	/*
给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。(leetcode 653)
思路1：
先序遍历整个树，如果树中有 k - root->val 这个值，返回真。否则按先序遍历继续找。


 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 
	class Solution {
		public:
		bool findNum(TreeNode *node, TreeNode *cur_node, int num){
			while(node != NULL){
				if(num > node->val)
					node = node->right;
				else if(num < node->val)
					node = node->left;
				else if(num == node->val && node != cur_node)
					return true;
				else if(num == node->val && node == cur_node)
					return false;
			}
			return false;
			
		}
		void findTarget1(TreeNode *root, TreeNode *cur_node, int k, bool &result){
			if(cur_node != NULL){
				int need_find = k - cur_node->val;
				if(findNum(root, cur_node, need_find))
					result = true;
				
				if(result == false)
					findTarget1(root, cur_node->left, k, result);
				if(result == false)
					findTarget1(root, cur_node->right, k, result);
			}
		}
		bool findTarget(TreeNode* root, int k) {
			if(root == NULL)
				return false;
			TreeNode* cur_root = root;
			bool result = false;
			findTarget1(root, cur_root, k, result);
			return result;
		}
	};

	方法2：
	使用辅助数组，利用中序遍历的到的数组是一个升序数组，那么之后就按照升序数组的方法继续计算就可以。这个方法比较好，不适用递归，不容易出错。
	

	 * Definition for a binary tree node.
	 * struct TreeNode {
	 *     int val;
	 *     TreeNode *left;
	 *     TreeNode *right;
	 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
	 * };

	class Solution {
		public:
		
		void inorder(TreeNode*root, vector<int> &help) {
			if (root) {
				inorder(root -> left, help);
				help.push_back(root -> val);
				inorder(root -> right, help);
			}
		}
		
		bool findTarget(TreeNode*root, int k) {
			vector<int> help;
			inorder(root, help);
			int index1 = 0;
			int index2 = help.size() - 1;
			while (index1 < index2) {
				if (help[index1] + help[index2] == k)
					return true;
				else if (help[index1] + help[index2] > k)
					index2--;
				else if (help[index1] + help[index2] < k)
					index1++;
			}
			return false;
		}
	}
	

	
	给定一个包含 n
	个整数的数组 nums，
	判断 nums
	中是否存在三个元素 a，b，c ，
	使得 a +b +c =0 ？找出所有满足条件且不重复的三元组。注意：答案中不可以包含重复的三元组。(leetcode 15)
	思路：
	首先将数组排序，然后从左到右遍历这个数组。在当前遍历的值右边找到两个数加和等于当前值的相反数。由于是要三个数加和等于0，那么一定有一个数小于0，所以只需要遍历到小于等于0的区域。
	
	class Solution {
		public:
		
		vector<vector<int>> threeSum(vector<int>&nums) {
			vector<vector<int>> result;
			int length = nums.size();
			if (length == 0)
				return result;
			sort(nums.begin(), nums.end());
			
			int i = 0;
			for (int i = 0; i < length; i++) {
				if (nums[i] > 0)
					break;
				if (i != 0 && nums[i] == nums[i - 1])
					continue;
				
				int need_find = 0 - nums[i];
				int L = i + 1;
				int R = length - 1;
				while (L < R) {
					
					if (L > i + 1 && nums[L] == nums[L - 1]) {
						L++;
						continue;
					}
					
					if (R < length - 1 && nums[R] == nums[R + 1]) {
						R--;
						continue;
					}
					
					
					// cout<< L << " "<< R<< endl;
					if (nums[L] + nums[R] > need_find)
						R--;
					else if (nums[L] + nums[R] < need_find)
						L++;
					else if (nums[L] + nums[R] == need_find) {
						vector<int> cur_result (3);
						cur_result[0] = nums[i];
						cur_result[1] = nums[L];
						cur_result[2] = nums[R];
						result.push_back(cur_result);
						++L;
						--R;
					}
				}
			}
			return result;
		}
	}
	
	;
	
	给定一个包括 n
	个整数的数组 nums
	和 一个目标值
	target。
	找出 nums
	中的三个整数，
	使得它们的和与 target
	最接近。返回这三个数的和。假定每组输入只存在唯一答案。(leetcode 16)
	思路：
	和上题基本类似
	
	class Solution {
		public:
		
		int threeSumClosest(vector<int>&nums, int target) {
			int distance = INT_MAX;
			int sum;
			int length = nums.size();
			if (length < 3)
				return -1;
			sort(nums.begin(), nums.end());
			for (int i = 0; i < length - 2; i++) {
				int L = i + 1;
				int R = length - 1;
				while (L < R) {
					int cur_sum = nums[i] + nums[L] + nums[R];
					int cur_dis = abs(cur_sum - target);
					if (cur_dis < distance) {
						distance = cur_dis;
						sum = cur_sum;
					}
					if (cur_sum < target)
						L++;
					else if (cur_sum > target)
						R--;
					else if (cur_sum == target)
						return cur_sum;
					
				}
				
			}
			return sum;
			
		}
	}
	
	;
	
	给定一个长度为n的数组和一个整数M，在这个数组里选择三个数，三个数的和小于等于M，
	
	返回有多少种方法(大疆笔试题)
	
	思路
	和三个数相加为0的思路基本一致，区别在于我们要求小于等于M。举例：[1,3,4,5]，如果L指向1，R指向5。如果当前nums[L]+nums[R] < =M,那么[1,5],[1,4],[1,3]均满足条件，故count +3。但是我们也要考虑可能出现重复元素的情况，例如[1,3,3,4,5]，L指向1，R指向5。那么如果还是按上述的方法满足条件的有：[1,3],[1,3],[1,4],[1,5]四种。实际上里面有重复。所有用一个辅助数组记录nums当的每个值前面有多少重复值。count+4之后再减去重复。但是如果[1,1,3,4,5]，L指向1，R指向5。那么实际结果是[1,1],[1,3],[1,4],[1,5]。如果减去辅助数组里记录的值，那么就会少1，所有如果是nums[L]==nums[L+1],那么count+4-1+1.
	
	
	int cal_count(vector<int> &array, int M) {
		sort(array.begin(), array.end());
		vector<int> dup (array.size(), 0);
		for (int j = 1; j < dup.size(); ++j) {
			if (array[j] == array[j - 1])
				dup[j] = dup[j - 1] + 1;
			else
				dup[j] = dup[j - 1];
			int count = 0;
			for (int i = 0; i < array.size() - 2; ++i) {
				if (i > 0 && array[i] == array[i - 1])
					continue;
				int L = i + 1;
				int R = array.size() - 1;
				while (L < R) {
					if (array[L] == array[L - 1] && L != i + 1) {
						L++;
						continue;
					}
					int cur_sum = array[i] + array[L] + array[R];
					if (cur_sum <= M) {
						count = count + R - L - (dup[R] - dup[L]);
						if (array[L] == array[L + 1])
							count++;
						L++;
						cout << count << endl;
					} else
						R--;
				}
				
			}
			return count;
		}
	}
	
	int main() {
		vector<int> array = {3, 2, 5, 2, 1, 4, 2, 3};
		int M = 10;
		int result = cal_count(array, M);
		cout << result << endl;
	}
	
	给定一个包含 n
	个整数的数组 nums
	和一个目标值 target，
	判断 nums
	中是否存在四个元素 a，b，
	c 和
	d ，
	使得 a +b +c +
	d 的值与
	target 相等？找出所有满足条件且不重复的四元组。（leetcode 18）
	思路：
	和三个数相加等于固定值类似。这次是固定两个数。
	
	时间复杂度O(N3)O(N3)，这个题不能用暴力递归，时间复杂度太高，过不去。
	
	class Solution {
		public:
		
		vector<vector<int>> fourSum(vector<int>&nums, int target) {
			vector<vector<int>> result;
			int length = nums.size();
			if (length < 4)
				return result;
			sort(nums.begin(), nums.end());
			for (int i = 0; i < length - 3; i++) {
				if (i != 0 && nums[i] == nums[i - 1])
					continue;
				for (int j = i + 1; j < length - 2; j++) {
					if (j != i + 1 && nums[j] == nums[j - 1])
						continue;
					int L = j + 1;
					int R = length - 1;
					while (L < R) {
						if (L != j + 1 && nums[L] == nums[L - 1]) {
							L++;
							continue;
						}
						
						if (R != length - 1 && nums[R] == nums[R + 1]) {
							R--;
							continue;
						}
						
						int sum = nums[i] + nums[j] + nums[L] + nums[R];
						if (sum == target) {
							result.push_back({nums[i], nums[j], nums[L], nums[R]});
							L++;
							R--;
						} else if (sum > target)
							R--;
						else
							L++;
					}
				}
			}
			return result;
		}
		
	}
	
	;
	
	给定四个包含整数的数组列表 A, B, C, D, 计算有多少个元组 (i,j,k,l) ，
	使得 A[
	i]+B[j]+C[k]+D[l]=0。为了使问题简单化，
	所有的 A, B, C, D
	具有相同的长度 N，且 0 ≤N ≤ 500 。所有整数的范围在 -228到 228-1之间，最终结果不会超过 231-1 。(leetcode 454)
	思路：
	使用unorder_map查找时间可以达到常数。
	
	class Solution {
		public:
		
		int fourSumCount(vector<int>&A, vector<int>&B, vector<int>&C, vector<int>&D) {
			int length = A.size();
			unordered_map<int, int> help;
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					help[A[i] + B[j]]++;
				}
			}
			int count = 0;
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < length; j++) {
					int sum = C[i] + D[j];
					int need_find = -sum;
					count += help.count(need_find) ? help[need_find] : 0;
				}
			}
			return count;
		}
	}


	 */
	
	
}
