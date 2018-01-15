package com.java;

import java.util.Stack;

/**
 * @author Rahul
 *
 */
public class BSTInOrder {
	public static void main(String[] args) {
		TreeNode root = CreateBinaryTree.createBinaryTree();
		BSTInOrder inOrder = new BSTInOrder();
		System.out.println("Using Recursive solution:");
		inOrder.inOrderRecursive(root);
		System.out.println("\n\nUsing Iterative solution:");
		inOrder.inOrderIterative(root);
	}

	/**
	 * @param root
	 */
	public void inOrderRecursive(TreeNode root) {
		if (root != null) {
			inOrderRecursive(root.left);
			System.out.printf("%d ", root.val);
			inOrderRecursive(root.right);
		}
	}

	/**
	 * @param root
	 */
	public void inOrderIterative(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode currentNode = root;

		while (!s.empty() || currentNode != null) {
			if (currentNode != null) {
				s.push(currentNode);
				currentNode = currentNode.left;
			} else {
				TreeNode n = s.pop();
				System.out.printf("%d ", n.val);
				currentNode = n.right;
			}
		}
	}
}
