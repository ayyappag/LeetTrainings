package com.studyplan.algorithmsone.medium;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/solution/
public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -4, -1, 0, 3, 10 };
		int k = 1;// number of rotations
		System.out.println(11%3);
		rotate(a, k);
		System.out.println(Arrays.toString(a));

	}

	public static void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
