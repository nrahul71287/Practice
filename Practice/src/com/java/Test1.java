package com.java;

import java.util.Stack;

public class Test1 {

	static int distributeCandy(int[] score) {
		int current, previous, next, totalCandy = 0;
		int [] countArray = new int[score.length];
		for(int i = 1; i < score.length-1; i++){
			previous = score[i - 1];
			current = score[i];
			next = score[i + 1];
			if(current > previous){
				countArray[i] = countArray[i-1] + 1; 
			}
			if(current < previous){
				countArray[i-1]++;
			}
			if(current == previous){
				countArray[i] = countArray[i-1] - 1;
			}
			
			if(next > current){
				countArray[i+1] = countArray[i] + 1; 
			}
			if(next < current){
				countArray[i+1]--;
			}
			if(next == current){
				countArray[i+1] = countArray[i] - 1;
			}
		}
		
		for(int i = 0; i < countArray.length; i++){
			totalCandy = totalCandy + countArray[i];
		}
		
		totalCandy = totalCandy + score.length;
		return totalCandy;
	}
	
	public void test2(){
		Stack<TreeNode> stack = new Stack<TreeNode>();
		 
	    TreeNode p = root;
	    int result = 0;
	 
	    while(!stack.isEmpty() || p!=null){
	        if(p!=null){
	            stack.push(p);
	            p = p.left;
	        }else{
	            TreeNode t = stack.pop();
	            k--;
	            if(k==0)
	                result = t.val;
	            p = t.right;
	        }
	    }
	 
	    return result;
	}

	public static void main(String[] args) {
		int[] score = new int[]{2,4,2,6,1,7,8,9,2,1};
		System.out.println(distributeCandy(score));
	}

}
