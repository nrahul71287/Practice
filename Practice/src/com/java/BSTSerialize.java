package com.java;

import java.util.StringTokenizer;

public class BSTSerialize {
	StringBuilder sb = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	if(root == null){
    		sb.append("null,");
        }else{
        	sb.append(root.val + ",");  
        	serialize(root.left);
        	serialize(root.right);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return null;
    }
    
    public static void main(String[] args) {
    	BSTSerialize bstIns = new BSTSerialize();
    	String strBst = bstIns.serialize(CreateBinaryTree.createBinaryTree());
    	System.out.println(strBst);
    	StringTokenizer st = new StringTokenizer("asd", "");
	}
}
