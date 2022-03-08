package com.studyplan.algorithmsone.easy;

import java.util.Stack;

public class MinStack {

	private Stack<Integer> stack = new Stack<>();
	private Stack<Integer> minStack = new Stack<>();

	public MinStack() {
	}

	public void push(int x) {
		stack.push(x);
		if (minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
	}

	public void pop() {
		if (stack.peek().equals(minStack.peek())) {
			minStack.pop();
		}
		stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.peek();
	}

	public static void main(String[] args) {
		MinStack m = new MinStack();
		m.push(2);
		m.push(0);
		m.push(3);
		m.push(0);
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());

	}

}
