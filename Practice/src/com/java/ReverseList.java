package com.java;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode nextNode = head.next;
		head.next = null;
		ListNode revRest = reverseList(nextNode);
		nextNode.next = head;
		return revRest;
	}

	public ListNode reverseListIterative(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode currentNode = head;
		// For first node, previousNode will be null
		ListNode previousNode = null;
		ListNode nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			// reversing the link
			currentNode.next = previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

	public static void main(String[] args) {
		ReverseList rev = new ReverseList();
		rev.reverseList(null);
		rev.reverseListIterative(null);
	}
}
