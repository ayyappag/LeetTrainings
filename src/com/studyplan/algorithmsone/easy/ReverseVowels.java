package com.studyplan.algorithmsone.easy;

// https://leetcode.com/problems/reverse-vowels-of-a-string/

// pending
public class ReverseVowels {

	static char[] charArray = new char[] { 'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {

		// System.out.println(reverseVowels("hello"));
		// System.out.println(reverseVowels("leetcode"));
		System.out.println(reverseVowels("aA"));
		System.out.println(reverseVowels("hEllo"));
		System.out.println(reverseVowels("race a car"));
	}

	public static String reverseVowels(String s) {

		if (s.length() == 1)
			return s;
		int i = 0, j = s.length() - 1;

		char[] c = s.toCharArray();

		while (i <= j) {

			if (!isValid(c[i]))
				i++;
			if (!isValid(c[j]))
				j--;
			if (isValid(c[i]) && isValid(c[j])) {
				char tmp = c[i];
				c[i] = c[j];
				c[j] = tmp;
				i++;
				j--;
			}
		}

		return String.valueOf(c);
	}

	public static boolean isValid(char c) {
		for (int i = 0; i < charArray.length; i++) {
			if (Character.toLowerCase(charArray[i]) == Character.toLowerCase(c))
				return true;
		}
		return false;
	}
	
	
	
	

}
