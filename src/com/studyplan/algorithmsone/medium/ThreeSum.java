package com.studyplan.algorithmsone.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {

		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
		int target = 0;
		List<List<Integer>> list = findThreeSum_Sorting(nums, target);
		System.out.println("hello");
	}

	public static List<List<Integer>> findThreeSum_Sorting(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Set<List<Integer>> t = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				if (nums[i] + nums[left] + nums[right] == target) {
					Integer[] integers = new Integer[] { nums[i], nums[left], nums[right] };
					// if (!result.contains(integers)) {
					// result.add(Arrays.asList(integers));
					t.add(Arrays.asList(integers));
					// }

					left++;
					right--;
				} else if (nums[i] + nums[left] + nums[right] < target) {
					left++;
				} else {
					right--;
				}
			}
		}
		result.addAll(t);
		return result;
	}

}
