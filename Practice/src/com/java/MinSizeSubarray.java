package com.java;

public class MinSizeSubarray {
	public int minSubArrayLen(int s, int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

		while (j < nums.length) {
			sum = sum + nums[j];
			j++;

			while (sum >= s) {
				min = Math.min(min, j - i);
				sum = sum - nums[i];
				i++;
			}
		}

		return min == Integer.MAX_VALUE ? 0 : min;
	}

	public static void main(String[] args) {
		MinSizeSubarray test = new MinSizeSubarray();
		System.out.println(test.minSubArrayLen(7,new int[]{2,3,1,2,2}));
	}

}
