package com.java;

import java.util.ArrayList;

public class CreateNaryTree {
	public static NaryTreeNode createNaryTree()  
	 {  
	  
	  NaryTreeNode node1=new NaryTreeNode("1");  
	  NaryTreeNode node2=new NaryTreeNode("2");  
	  NaryTreeNode node3=new NaryTreeNode("3");  
	  NaryTreeNode node4=new NaryTreeNode("4");  
	  NaryTreeNode node5=new NaryTreeNode("5");  
	  NaryTreeNode node6=new NaryTreeNode("6");  
	  NaryTreeNode node7=new NaryTreeNode("7");  
	  NaryTreeNode node8=new NaryTreeNode("8");  
	  NaryTreeNode node9=new NaryTreeNode("9");  
	  NaryTreeNode node10=new NaryTreeNode("10");
	  NaryTreeNode node11=new NaryTreeNode("11");
	  NaryTreeNode node20=new NaryTreeNode("20");
	  NaryTreeNode node21=new NaryTreeNode("21");
	  NaryTreeNode node22=new NaryTreeNode("22");
	  NaryTreeNode node30=new NaryTreeNode("30");
	  NaryTreeNode node40=new NaryTreeNode("40");
	  
	  
	  ArrayList<NaryTreeNode> list40 = new ArrayList<NaryTreeNode>();
	  list40.add(node20);
	  list40.add(node10);
	  list40.add(node30);
	  node40.childrens = list40;
	  
	  
	  ArrayList<NaryTreeNode> list20 = new ArrayList<NaryTreeNode>();
	  list20.add(node1);
	  list20.add(node2);
	  list20.add(node3);
	  node20.childrens = list20;
	  
	  ArrayList<NaryTreeNode> list10 = new ArrayList<NaryTreeNode>();
	  list10.add(node4);
	  list10.add(node5);
	  list10.add(node6);
	  node10.childrens = list10;
	  
	  ArrayList<NaryTreeNode> list30 = new ArrayList<NaryTreeNode>();
	  list30.add(node7);
	  list30.add(node8);
	  list30.add(node9);
	  list30.add(node11);
	  node30.childrens = list30;
	  
	  ArrayList<NaryTreeNode> list5 = new ArrayList<NaryTreeNode>();
	  list5.add(node21);
	  list5.add(node22);
	  node5.childrens = list5;
	  
	  return node40;  
	 }  
}
