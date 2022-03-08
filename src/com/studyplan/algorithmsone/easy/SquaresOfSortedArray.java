package com.studyplan.algorithmsone.easy;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] a = { -4, -1, 0, 3, 10 };

		int[] result = solution(a);
		System.out.println(Arrays.toString(result));
	}

	private static int[] solution(int[] a) {
		// TODO Auto-generated method stub
		int[] temp = new int[a.length];
		int left = 0, right = a.length - 1;
		int index = a.length - 1;

		while (left <= right) {
			int lSquare = a[left] * a[left];
			int rSquare = a[right] * a[right];
			if (lSquare > rSquare) {
				temp[index--] = lSquare;
				left++;
			} else {
				temp[index--] = rSquare;
				right--;
			}
		}
		return temp;
	}
}
