package com.studyplan.algorithmsone.easy;

// https://leetcode.com/problems/reverse-vowels-of-a-string/

// pending
public class ReverseVowels2 {

	public static void main(String[] args) {

		System.out.println(reverseVowels("hello"));
		System.out.println(reverseVowels("leetcode"));
		System.out.println(reverseVowels("aA"));
		System.out.println(reverseVowels("hEllo"));
		System.out.println(reverseVowels("race a car"));
	}

	public static String reverseVowels(String s) {

		if (s == null || s.length() <= 1)
			return s;

		char[] arr = s.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (isVowel(arr, i) && isVowel(arr, j)) {
				swap(arr, i, j);
				i++;
				j--;
			} else if (isVowel(arr, i)) {
				j--;
			} else if (isVowel(arr, j)) {
				i++;
			} else {
				i++;
				j--;
			}
		}
		return new String(arr);
	}

	private static boolean isVowel(char[] arr, int i) {

		char ch = Character.toLowerCase(arr[i]);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
