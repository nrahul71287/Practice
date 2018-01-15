package com.java;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeNode {
	String data;
	List<NaryTreeNode> childrens;

	NaryTreeNode(String data) {
		this.data=data;
		this.childrens = new ArrayList<NaryTreeNode>();
	}
}
