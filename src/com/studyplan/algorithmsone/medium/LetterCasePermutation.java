package com.studyplan.algorithmsone.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCasePermutation t = new LetterCasePermutation();
		String s = "a1b2";
		List<String> k = t.letterCasePermutation(s);
		k.stream().forEach(System.out::println);

	}

	public List<String> letterCasePermutation(String S) {
		List<StringBuilder> ans = new ArrayList<StringBuilder>();
		ans.add(new StringBuilder());

		for (char c : S.toCharArray()) {
			int n = ans.size();
			if (Character.isLetter(c)) {
				for (int i = 0; i < n; ++i) {
					ans.add(new StringBuilder(ans.get(i)));
					ans.get(i).append(Character.toLowerCase(c));
					ans.get(n + i).append(Character.toUpperCase(c));
				}
			} else {
				for (int i = 0; i < n; ++i)
					ans.get(i).append(c);
			}
		}

		List<String> finalans = new ArrayList();
		for (StringBuilder sb : ans)
			finalans.add(sb.toString());
		return finalans;
	}
}
