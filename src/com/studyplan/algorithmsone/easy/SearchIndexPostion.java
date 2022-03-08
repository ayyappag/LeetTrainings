package com.studyplan.algorithmsone.easy;


// https://leetcode.com/problems/search-insert-position/
public class SearchIndexPostion {

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 2;
		int index = searchInsert(nums, target);
		System.out.println("index = " + index);
	}

	public static int searchInsert(int[] nums, int target) {
		int pivot, left = 0, right = nums.length - 1;
		while (left <= right) {
			pivot = (left +right) / 2;
			if (nums[pivot] == target)
				return pivot;
			if (target < nums[pivot])
				right = pivot - 1;
			else
				left = pivot + 1;
		}
		return left;
	}

}
