package com.java;

public class StringToInteger {
	public int convert(String input) {
		if (input == null || input.length() == 0)
			return 0;
	 
		// trim white spaces
		input = input.trim();
		if (input.length() == 0)
			return 0;
		
		char flag = '+';
	 
		// check negative or positive
		int i = 0;
		if (input.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (input.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
	 
		// calculate value
		while (i < input.length() && input.charAt(i) >= '0' && input.charAt(i) <= '9') {
			result = result * 10 + (input.charAt(i) - '0');
			i++;
		}
	 
		if (flag == '-')
			result = -result;
	 
		// handle max and min
		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
	 
		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
	 
		return (int) result;
	}
	
	public static void main(String args[]){
		StringToInteger strToInt = new StringToInteger();
		int convertedInt = strToInt.convert("123");
		System.out.println(convertedInt);
	}
}
