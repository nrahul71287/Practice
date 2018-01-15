package com.java;

import java.math.BigDecimal;

public class Test {

	public <T extends Number> void sum(T... numbers) {
		BigDecimal sum = BigDecimal.ZERO;
		for (T number : numbers) {
			sum = sum.add(new BigDecimal(number.toString()));
		}
		System.out.println("Sum of array elements is : " + sum);
	}
	
	public <T extends Number> void average(T[] numbers) {
		BigDecimal sum = BigDecimal.ZERO;
		for (T number : numbers) {			sum = sum.add(new BigDecimal(number.toString()));
		}
		System.out.println("Average of array elements is : "
				+ sum.divide(new BigDecimal(numbers.length)));
	}

	public <T extends Number> void median(T... numbers) {
		int middle = numbers.length / 2;
		if (numbers.length % 2 == 0) {
			System.out.println("Median of array is : "
					+ (numbers[middle].doubleValue() + numbers[middle - 1].doubleValue()) / 2);
		} else {
			System.out.println("Median of array is : " + numbers[middle]);
		}
	}

	public <T extends Number> void mode(T... numbers) {
		int modeCount = 1;
		int maxCount = 0;
		T previous = null;
		T mode = null;
		for (T item : numbers) {
			if (item == previous) {
				modeCount++;
			} else {
				if (modeCount > maxCount) {
					mode = previous;
					maxCount = modeCount;
				}
				modeCount = 1;
			}
			previous = item;
		}
		System.out.println("Mode is " + mode + " and is occurring " + maxCount
				+ " times");
	}
	
	public 

	public static void main(String[] args) {
		Test test = new Test();
//		test.sum(2.20, 2.30);
//		Integer[] a = new Integer [] {2,2};
//		test.average(a);
//		test.median(2, 2, 6, 6, 6, 7, 7, 7, 7, 8, 8);
//		test.mode(2, 2, 6, 6, 7, 7, 7, 7, 8, 8);
		String[] points1 = new String[] {"A", "B"};
		String[] points2 = new String[] {"B", "C"};
		String[] points3 = new String[] {"C", "D"};
		
		
	}
}
