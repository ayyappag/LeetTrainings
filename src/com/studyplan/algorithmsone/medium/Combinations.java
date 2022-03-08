package com.studyplan.algorithmsone.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/combinations/submissions/
public class Combinations {

	public static void main(String[] args) {
		List<List<Integer>> list = combine(4, 2);
		list.stream().forEach(System.out::println);
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> list = new ArrayList<>();
		combineHelper(list, new ArrayList<>(), n, k, 1);
		return list;
	}

	private static void combineHelper(List<List<Integer>> list, List<Integer> list2, int n, int k, int index) {
		// if list size reaches k. just add it to the answer
		if (list2.size() == k) {
			// create new copy as we keep on modifying exisiting current list
			list.add(new ArrayList<>(list2));
			return;
		}
		// iterate from index till n
		for (int i = index; i <= n; i++) {
			// add current element to the current list
			list2.add(i);
			// call again for next level check.
			combineHelper(list, list2, n, k, i + 1);
			// backtrack
			list2.remove(list2.size() - 1);
		}
	}

}
