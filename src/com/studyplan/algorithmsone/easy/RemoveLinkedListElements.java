package com.studyplan.algorithmsone.easy;

import com.studyplan.algorithmsone.easy.ListNode;

// https://leetcode.com/problems/remove-linked-list-elements/solution/
public class RemoveLinkedListElements {

	public static void main(String[] args) {

	}

	public ListNode removeElements(ListNode head, int val) {
		ListNode sentinel = new ListNode(0);
		sentinel.next = head;

		ListNode prev = sentinel, curr = head;
		while (curr != null) {
			if (curr.val == val)
				prev.next = curr.next;
			else
				prev = curr;
			curr = curr.next;
		}
		return sentinel.next;
	}
}
//
//// single linked list
//class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode() {
//	}
//
//	ListNode(int val) {
//		this.val = val;
//	}
//
//	ListNode(int val, ListNode next) {
//		this.val = val;
//		this.next = next;
//	}
//}