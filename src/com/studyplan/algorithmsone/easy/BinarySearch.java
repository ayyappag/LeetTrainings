package com.studyplan.algorithmsone.easy;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int target = 2;
		
		int[] nums2 = { 5 };
		int target2 = 5;
		

		int index = binarySearch(nums2, target2);
		System.out.println("index value  = " + index);
	}

	private static int binarySearch(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int midpoint = (left + right) / 2;
			if (nums[midpoint] == target)
				return midpoint;
			else if (target > nums[midpoint]  )
				left = midpoint + 1;
			else
				right = midpoint - 1;
		}

		return -1;
	}

}
