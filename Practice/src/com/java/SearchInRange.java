package com.java;

public class SearchInRange {
	
	public int[] getRange(int[] input, int target) {
		int getLeft = binarySearch(input, 0, input.length - 1, target);
		int getRight = binarySearch(input, 0, input.length - 1, target);
		return new int[] {getLeft, getRight};
	}
	
	private int binarySearch(int[] input, int start, int end, int target) {
		int mid = (end - start) / 2;
		if(target > input[mid]) {
			start = mid + 1;
		} else if (target < input[mid]) {
			end = mid - 1;
		} else {
			
		}
	}
	
	public static void main(String[] args) {
		int[] input = new int[] {1,2,3,3,4};
		SearchInRange searchInRange = new SearchInRange();
		int[] result = searchInRange.getRange(input, 3);
		System.out.println(result);
	}
}
