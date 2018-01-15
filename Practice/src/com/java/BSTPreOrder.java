package com.java;

import java.util.Stack;

/**
 * @author Rahul
 *
 */
public class BSTPreOrder {
	public static void main(String[] args) {
		TreeNode root = CreateBinaryTree.createBinaryTree();
		BSTPreOrder preOrder = new BSTPreOrder();
		System.out.println("Using Recursive solution:");
		preOrder.preOrderRecursive(root);
		System.out.println("\n\nUsing Iterative solution:");
		preOrder.preOrderIterative(root);
	}

	/**
	 * @param root
	 */
	public void preOrderRecursive(TreeNode root) {
		if (root != null) {
			System.out.printf("%d ", root.val);
			preOrderRecursive(root.left);
			preOrderRecursive(root.right);
		}
	}

	/**
	 * @param root
	 */
	public void preOrderIterative(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode n = stack.pop();
			System.out.printf("%d ", n.val);

			if (n.right != null) {
				stack.push(n.right);
			}

			if (n.left != null) {
				stack.push(n.left);
			}
		}
	}
}
