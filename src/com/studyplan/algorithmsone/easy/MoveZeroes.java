package com.studyplan.algorithmsone.easy;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 0,1,0,3,12 };
		System.out.println(11 % 3);
		moveZeros(a);
		System.out.println(Arrays.toString(a));
	}

	private static void moveZeros(int[] a) {
		// TODO Auto-generated method stub
		int index = 0, n = a.length - 1;

		for (int i = 0; i <= n; i++) {
			if (a[i] != 0)
				a[index++] = a[i];
		}
		while (index <= n) {
			a[index++] = 0;
		}

	}

}
