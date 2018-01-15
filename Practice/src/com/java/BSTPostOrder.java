package com.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Rahul
 *
 */
public class BSTPostOrder {
	public static void main(String[] args) {
		TreeNode root = CreateBinaryTree.createBinaryTree();
		BSTPostOrder preOrder = new BSTPostOrder();
		/*
		 * System.out.println("Using Recursive solution:");
		 * preOrder.postOrderRecursive(root);
		 * System.out.println("\n\nUsing Iterative solution:");
		 * preOrder.postOrderIterative(root);
		 */
		preOrder.levelOrderTraversal(root);
	}

	/**
	 * @param root
	 */
	public void postOrderRecursive(TreeNode root) {
		if (root != null) {
			postOrderRecursive(root.left);
			postOrderRecursive(root.right);
			System.out.printf("%d ", root.val);
		}
	}

	/**
	 * @param root
	 */
	public void postOrderIterative(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode current = root;

		while (true) {
			if (current != null) {
				if (current.right != null) {
					s.push(current.right);
				}
				s.push(current);
				current = current.left;
				continue;
			}

			if (s.isEmpty())
				return;
			current = s.pop();

			if (current.right != null && !s.isEmpty()
					&& current.right == s.peek()) {
				s.pop();
				s.push(current);
				current = current.right;
			} else {
				System.out.print(current.val + " ");
				current = null;
			}
		}
	}

	public void levelOrderTraversal(TreeNode startNode) {
		int level = 0;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();  
		queue.add(startNode);  

		int levelSize = queue.size();
		while(!queue.isEmpty())  
		{  	   
			TreeNode tempNode=queue.poll();
			levelSize--;
			System.out.println(tempNode.val + " Level "+level);  
			if(tempNode.left!=null)  {
				queue.add(tempNode.left);  
			}

			if(tempNode.right!=null)  {
				queue.add(tempNode.right); 
			} 
			if(levelSize == 0){
				levelSize = queue.size();
				level++;
			} 
		}	  
	}  
}
