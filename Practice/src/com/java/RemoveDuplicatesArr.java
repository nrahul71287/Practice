package com.java;

public class RemoveDuplicatesArr {
	public static int[] removeDuplicates(int[] input) {
		int i = 0;
		int j = 1;
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (j < input.length) {
			if (input[i] == input[j]) {
				j++;
			} else {
				i++;
				input[i] = input[j];
				j++;
			}
		}
		int[] output = new int[i + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}

		return output;
	}
	
	public static int[] removeDuplicatesTwo(int[] nums) {
		int i = 0;
        int j = 1;
        int count = 0;
        while(j < nums.length){
            if(nums[i] == nums[j]){
                if(count == 1){
                    j++;
                }
                else{
                    i++;
                    nums[i] = nums[j];
                    count++;
                }
            }else{
                i++;
                nums[i] = nums[j];
                count = 0;
            }
        }
        return nums;
	}

	public static void main(String a[]) {
		int[] input1 = { 1, 2, 2, 3, 3, 3, 4, 5};
		//int[] output = removeDuplicates(input1);
		int[] output = removeDuplicates(input1);
		for (int i : output) {
			System.out.print(i + " ");
		}

		/*
		 * long f = 0; long g = 1;
		 * 
		 * for (long i = 0; i < 93; i++) { System.out.print(f + " "); f = f + g;
		 * g = f - g; }
		 */

	}
}
