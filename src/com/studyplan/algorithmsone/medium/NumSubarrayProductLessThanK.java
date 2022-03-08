package com.studyplan.algorithmsone.medium;

public class NumSubarrayProductLessThanK {
	public static void main(String[] args) {
		int[] nums = new int[] { 10, 5, 2, 6 };
		int k = 100;
		System.out.println("count : " + 
		numSubarrayProductLessThanK(nums, k));
	}

	public static int numSubarrayProductLessThanK(int[] nums, int k) {
		if (k <= 1)
			return 0;
		int prod = 1, ans = 0, left = 0;
		for (int right = 0; right < nums.length; right++) {
			prod *= nums[right];
			while (prod >= k)
				prod /= nums[left++];
			ans += right - left + 1;
		}
		return ans;
	}

}
