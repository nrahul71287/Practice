package com.java;

public class FactorialTrailingZeroes {

	public int trailingZeroes(int n) {
		int count = 0;

		for (int i = 5; n / i >= 1; i *= 5) {
			count += n / i;
		}
		return count;
	}

	public static void main(String[] args) {
		FactorialTrailingZeroes test = new FactorialTrailingZeroes();
		System.out.println(test.trailingZeroes(100));
	}

}
