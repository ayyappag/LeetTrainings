package com.studyplan.algorithmsone.easy;

public class MinStack2 {
	private Node head;

	// private int MIN = Integer.MAX_VALUE;
	/** initialize your data structure here. */
	public MinStack2() {
		this.head = null;
	}

	public void push(int val) {
		Node node = new Node(val);
		if (this.head == null) {
			node.min = val;
		} else {
			node.min = Math.min(this.head.min, val);
		}
		node.next = this.head;
		this.head = node;
	}

	public void pop() {
		this.head = head.next;
	}

	public int top() {
		return this.head.val;
	}

	public int getMin() {
		return this.head.min;
	}

	private class Node {
		int val;
		int min;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}
}
