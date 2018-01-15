package com.java;

import java.util.LinkedList;
import java.util.Queue;

import javafx.util.Pair;

/**
 * @author Rahul
 *
 */
public class NaryTreeTraversal {
	int level = 0;
	Queue<NaryTreeNode> treeQueue = new LinkedList<NaryTreeNode>();

	public static void main(String[] args) {
		NaryTreeNode root = CreateNaryTree.createNaryTree();
		NaryTreeTraversal preOrder = new NaryTreeTraversal();

		/*
		 * System.out.println("Using Recursive solution:");
		 * preOrder.postOrderRecursive(root);
		 * System.out.println("\n\nUsing Iterative solution:");
		 * preOrder.postOrderIterative(root);
		 */
		int level = 0;
		preOrder.naryTreeTraversalDFSFormatted(root, level, true);
		 //preOrder.naryTreeTraversalBFS(root);
	}

	// traversal using pre order(DFS)
	private void naryTreeTraversalDFS(NaryTreeNode root) {
		if (root == null) {
			return;
		}

		System.out.println("Level :" + level + " = " + root.data);

		if (root.childrens.size() > 0)
			level++;
		for (NaryTreeNode node : root.childrens) {
			naryTreeTraversalDFS(node);
		}
	}

	// traversal using pre order(DFS)
	/*
	 * private void naryTreeTraversalDFSFormatted(Node root,int level){ if(root
	 * == null){ return; } String space = generateSpace(level); //
	 * System.out.println("Level " + level);
	 * System.out.println(space+root.data+",("+level+")");
	 * 
	 * for(Node node:root.childrens){
	 * naryTreeTraversalDFSFormatted(node,level+1); } }
	 */

	private void naryTreeTraversalDFSFormatted(NaryTreeNode root, int level,
			boolean isRoot) {
		if (root == null) {
			return;
		}
		if (!isRoot) {
			String space = indent(level);
			// System.out.println("Level " + level);
			System.out.println(space + root.data);
		}

		for (NaryTreeNode node : root.childrens) {
			naryTreeTraversalDFSFormatted(node, level + 1, false);
		}
	}

	private String indent(int level) {
		StringBuilder sb = new StringBuilder();
		// System.out.println("Level :"+level);
		for (int i = 0; i < level; i++) {
			if (i == level - 1)
				sb.append("+---");
			else
				sb.append("|   ");
		}
		return sb.toString();
	}

	// traversal using BFS
	private void naryTreeTraversalBFS(NaryTreeNode root) {
		if (root == null) {
			return;
		}
		treeQueue.add(root);
		int level = 0, levelSize = treeQueue.size();
		System.out.print("Level " + level + " : ");
		while (!treeQueue.isEmpty()) {
			NaryTreeNode removed = treeQueue.poll();
			levelSize--;
			System.out.print(removed.data + " ");
			for (NaryTreeNode node : removed.childrens) {
				treeQueue.add(node);
			}
			if (levelSize == 0) {
				levelSize = treeQueue.size();
				if (levelSize > 0)
					System.out.print("\nLevel " + (++level) + " : ");
			}
		}

	}
	
	public void naryTreeTraversalDFSTest(NaryTreeNode root, int level, boolean isRoot){
		if(root == null){
			return;
		}
		
		if(!isRoot){
			String space = generateSpace(level);
			System.out.println(space + root.data);
		}
		
		for(NaryTreeNode node : root.childrens){
			naryTreeTraversalDFSTest(node, level+1, false);
		}
	}
	
	private String generateSpace(int level){
		String strSpace = "";
		for(int i = 0; i < level; i++){
			if(i == level - 1){
				strSpace = strSpace + " -";
			}else{
				strSpace = strSpace + "  ";
			}
		}
		return strSpace;
	}
	
}








































