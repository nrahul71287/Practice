package com.java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
	 
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index ;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
	 
		return result;
	    }
	
	public static void main(String args[]){
		TwoSum sum = new TwoSum();
		int[] arr = new int[]{1,4,3,4,5}; 
		int[] outArr = sum.twoSum(arr, 8);
		System.out.println(outArr[0] + " " + outArr[1]);
	}
}
