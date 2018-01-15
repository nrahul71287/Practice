package com.java;

public class ReverseBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		if (root == null) { 
			return root; 
		};
		//reverse left and right nodes
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;

		if(root.left != null){ 
			invertTree(root.left);
		}
		if(root.right != null){ 
			invertTree(root.right);
		}
		return root;
	}
}
