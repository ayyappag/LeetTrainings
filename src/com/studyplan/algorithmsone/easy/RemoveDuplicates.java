package com.studyplan.algorithmsone.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2 };
		// int[] a = { 0,0,1,1,1,2,2,3,3,4 };
		int count = removeDuplicates(a);
		System.out.println("Count of non duplicate elements = " + count);
		System.out.println("Count of non duplicate elements = " + removeDuplicatesLeetCode(a));
	}

	private static int removeDuplicates(int[] a) {
		// TODO Auto-generated method stub
		if (a.length == 0)
			return 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		int[] result = new int[a.length];
		for (int i = 0; i <= a.length - 1; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
				result[i] = a[i];
				count++;
			}
		}
		return count + 1;
	}

	public static int removeDuplicatesLeetCode(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}
}
