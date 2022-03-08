package com.studyplan.algorithmsone.easy;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "God Ding";
		// System.out.println("" + reverseWords(s));
		
		System.out.println("" + reverseWordsFewChars("abcdefg",2));

	}
	
	// https://leetcode.com/problems/reverse-string-ii/
	public static String reverseWordsFewChars(String s,int k ) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }

	public static String reverseWords(String s) {

		StringBuffer builder = new StringBuffer();
		String[] arr = s.split(" ");
		for (String str : arr) {
			builder.append(
					new StringBuffer(str).reverse()).append(" ");
		}
		
		return builder.toString().trim();
	}
	

}
