package com.studyplan.algorithmsone.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeVowels("leetcodeisacommunityforcoders"));
		System.out.println(removeVowels2("leetcodeisacommunityforcoders"));

	}

	public static String removeVowels2(String s) {
		return IntStream.range(0, s.length()).filter(i -> !VOWELS.contains(s.charAt(i)))
				.mapToObj(i -> String.valueOf(s.charAt(i))).collect(Collectors.joining());
	}

	static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

	public static String removeVowels(String s) {
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < s.length(); i++)
			if (!VOWELS.contains(s.charAt(i)))
				ans.append(s.charAt(i));
		return ans.toString();
	}
}
