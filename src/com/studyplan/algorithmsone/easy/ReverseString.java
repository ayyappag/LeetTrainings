package com.studyplan.algorithmsone.easy;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = new char[] { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);
	}

	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while (left < right) {
			char tmp = s[left];
			s[left++] = s[right];
			s[right--] = tmp;
		}
	}

}
