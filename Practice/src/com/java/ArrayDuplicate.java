package com.java;

import java.util.HashSet;

public class ArrayDuplicate {
	public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i < nums.length; i++){
            if(set.add(nums[i]))
                return true;
        }
        
        return false;
    }
	
	public static void main(String[] args) {
		ArrayDuplicate dup = new ArrayDuplicate();
		int[] a = new int[30000];
		for(int i = 0;i < 30000; i++){
			a[i] = i;
		}
		System.out.println(dup.containsDuplicate(a));
	}
}
