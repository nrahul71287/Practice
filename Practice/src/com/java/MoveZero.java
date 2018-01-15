package com.java;


public class MoveZero {
	public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) 
            return;        
        int index = 0;
        for (int i: nums) {
            if (i != 0){
                nums[index] = i;  
                index++;
            }
        }        

        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
	
	public static void main(String args[]){
		MoveZero zero = new MoveZero();
		int[] arr = new int[]{0,1,0,3,12};
		zero.moveZeroes(arr);
		System.out.println("Done");
	}
}
