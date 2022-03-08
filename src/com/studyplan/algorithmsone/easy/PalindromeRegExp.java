package com.studyplan.algorithmsone.easy;

// https://leetcode.com/problems/valid-palindrome/
/*
 * Notes :
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into
 * lowercase letters and removing all non-alphanumeric characters, it reads the
 * same forward and backward. Alphanumeric characters include letters and
 * numbers.
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama" Output: true Explanation:
 * "amanaplanacanalpanama" is a palindrome. Example 2:
 * 
 * Input: s = "race a car" Output: false Explanation: "raceacar" is not a
 * palindrome. Example 3:
 * 
 * Input: s = " " Output: true Explanation: s is an empty string "" after
 * removing non-alphanumeric characters. Since an empty string reads the same
 * forward and backward, it is a palindrome. }
 *
 */
public class PalindromeRegExp {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		int p = 0;
		int q = s.length() - 1;

		while (p <= q) {
			char c = s.charAt(p);
			char cb = s.charAt(q);

			if (!Character.isLetterOrDigit(c)) {
				p++;
				continue;
			}

			if (!Character.isLetterOrDigit(cb)) {
				q--;
				continue;
			}

			if (Character.toLowerCase(cb) != Character.toLowerCase(c))
				return false;
			p++;
			q--;
		}
		return true;

	}

}
