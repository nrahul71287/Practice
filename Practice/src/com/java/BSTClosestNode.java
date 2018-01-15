package com.java;

public class BSTClosestNode {
	TreeNode getClosestNode(TreeNode pRoot, int value)
	{
		TreeNode pClosest = null;
	    int minDistance = Integer.MAX_VALUE;
	    TreeNode pNode = pRoot;
	    while(pNode != null)
	    {
	        int distance = Math.abs(pNode.val - value);
	        if(distance < minDistance)
	        {
	            minDistance = distance;
	            pClosest = pNode;
	        }

	        if(distance == 0)
	            break;

	        if(value < pNode.val)
	            pNode = pNode.left;
	        else if(value > pNode.val)
	            pNode = pNode.right;
	    }

	    return pClosest;
	}
	
	public static void main(String[] args) {
		TreeNode root = CreateBinaryTree.createBinaryTree();
		BSTClosestNode closestNode = new BSTClosestNode();
		TreeNode closest = closestNode.getClosestNode(root,52);
		System.out.println(closest.val);
	}
}
