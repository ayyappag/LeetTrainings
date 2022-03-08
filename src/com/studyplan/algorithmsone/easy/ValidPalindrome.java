package com.studyplan.algorithmsone.easy;

// https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba"; // abc // aba
		System.out.println(validPalindrome(s));
		System.out.println(isPalindrome(s, 0, s.length() - 1));
	}


	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean validPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				// skip left OR skip right -> delete atmost one character
				return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
			}
		}
		return true;
	}

}
