package com.studyplan.algorithmsone.easy;

import java.util.Arrays;
import java.util.List;

public class MiddleNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ListNode>	head = Arrays.asList(new ListNode(1));
		//middleNode(head);
	}
	public static ListNode middleNode(ListNode head) {
		ListNode[] A = new ListNode[100];
		int t = 0;
		while (head != null) {
			A[t++] = head;
			head = head.next;
		}
		return A[t / 2];
	}

	public static ListNode middleNode2(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
