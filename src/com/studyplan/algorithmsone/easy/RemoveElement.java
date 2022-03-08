package com.studyplan.algorithmsone.easy;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int k = 2;
		System.out.println(11 % 3);
		int i = removeElement(a, k);
		System.out.println("i == " + i);
		System.out.println(Arrays.toString(a));
	}

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		for (int elem : nums) {
			if (elem != val) {
				nums[i] = elem;
				i++;
			}
		}
		return i;
	}

	public int removeElement2(int[] nums, int val) {
		int k = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}
