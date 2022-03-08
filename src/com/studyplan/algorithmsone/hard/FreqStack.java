package com.studyplan.algorithmsone.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/maximum-frequency-stack/

public class FreqStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreqStack freqStack = new FreqStack();
		freqStack.push(5); // The stack is [5]
		freqStack.push(7); // The stack is [5,7]
		freqStack.push(5); // The stack is [5,7,5]
		freqStack.push(7); // The stack is [5,7,5,7]
		freqStack.push(4); // The stack is [5,7,5,7,4]
		freqStack.push(5); // The stack is [5,7,5,7,4,5]
		freqStack.pop(); // return 5, as 5 is the most frequent. The stack becomes [5,7,5,7,4].
		freqStack.pop(); // return 7, as 5 and 7 is the most frequent, but 7 is closest to the top. The
							// stack becomes [5,7,5,4].
		freqStack.pop(); // return 5, as 5 is the most frequent. The stack becomes [5,7,4].
		freqStack.pop(); // return 4, as 4, 5 and 7 is the most frequent, but 4 is closest to the top.
							// The stack becomes [5,7].

	}

	Map<Integer, Integer> freq;
	Map<Integer, Stack<Integer>> group;
	int maxfreq;

	public FreqStack() {
		freq = new HashMap();
		group = new HashMap();
		maxfreq = 0;
	}

	public void push(int x) {
		int f = freq.getOrDefault(x, 0) + 1;
		freq.put(x, f);
		if (f > maxfreq)
			maxfreq = f;

		group.computeIfAbsent(f, z -> new Stack()).push(x);
	}

	public int pop() {
		int x = group.get(maxfreq).pop();
		freq.put(x, freq.get(x) - 1);
		if (group.get(maxfreq).size() == 0)
			maxfreq--;
		return x;
	}
}
