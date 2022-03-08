package com.studyplan.algorithmsone.easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/single-number/solution/
public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 2, 1 };
		System.out.println(" non repeatable number = " + singleNumber(nums));
	}

		public static int singleNumber(int[] nums) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				if (list.contains(nums[i])) {
					list.remove(new Integer(nums[i]));
				} else {
					list.add(new Integer(nums[i]));
				}
			}
			return list.get(0);
		}

}
