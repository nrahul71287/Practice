package com.java;

public class SortArray {

	public int[] testArr(int[] arr){
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= 0) {
				int temp = arr[i];
				for (int j = i; j > index; j--) {
					arr[j] = arr[j-1];
				}
				arr[index] = temp;

				if (temp < 0)	index++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] test = new int[]{1,2,-8,-9,9,-10,6,-19,8,0};
		SortArray sample = new SortArray();
		int[] result = sample.testArr(test);
		for(int item:result){
			System.out.print(item + " ");
		}
	}
}
