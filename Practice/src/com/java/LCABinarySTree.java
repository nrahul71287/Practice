package com.java;

import java.util.HashSet;

public class LCABinarySTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode currentNode = root;
		TreeNode foundNode = root;
		boolean pFound = false;
		boolean qFound = false;
		HashSet<TreeNode> pSet = new HashSet<TreeNode>();
		HashSet<TreeNode> qSet = new HashSet<TreeNode>();

		while (!pFound) {
			if (p.val < currentNode.val) {
				pSet.add(currentNode);
				currentNode = currentNode.left;
			} else if (p.val > currentNode.val) {
				pSet.add(currentNode);
				currentNode = currentNode.right;
			} else if (p.val == currentNode.val) {
				pSet.add(currentNode);
				pFound = true;
			}
		}
		currentNode = root;
		while (!qFound) {
			if (q.val < currentNode.val) {
				qSet.add(currentNode);
				currentNode = currentNode.left;
			} else if (q.val > currentNode.val) {
				qSet.add(currentNode);
				currentNode = currentNode.right;
			} else if (q.val == currentNode.val) {
				qSet.add(currentNode);
				qFound = true;
			}
		}

		for (TreeNode node : pSet) {
			if (qSet.contains(node)) {
				foundNode = node;
			}
		}
		return foundNode;
	}

	public static void main(String[] args) {
		LCABinarySTree tree = new LCABinarySTree();
		TreeNode node5 = new TreeNode(5);
		TreeNode node3 = new TreeNode(3);
		TreeNode node6 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2);
		TreeNode node4 = new TreeNode(4);
		TreeNode node1 = new TreeNode(1);
		node5.left = node3;
		node5.right = node6;
		node3.right = node4;
		node3.left = node2;
		node2.left = node1;
		TreeNode foundNode = tree.lowestCommonAncestor(node5, node1, node4);
		System.out.println(foundNode.val);
	}
}
