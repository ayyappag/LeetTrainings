package com.studyplan.algorithmsone.easy;

public class ReverseLinkedListNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;

	}

}
