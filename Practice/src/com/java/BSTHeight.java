package com.java;

import java.util.LinkedList;


public class BSTHeight {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	
	private void removeNode(ListNode node){
		node.val = node.next.val;
        node.next = node.next.next;
        System.out.println("Finished");
	}

	public static void main(String args[]) {
		BSTHeight height = new BSTHeight();
		System.out
				.println(height.maxDepth(CreateBinaryTree.createBinaryTree()));
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		height.removeNode(node3);
		
	}
}
