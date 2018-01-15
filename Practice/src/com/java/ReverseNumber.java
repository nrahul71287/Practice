package com.java;

import java.util.Scanner;

public class ReverseNumber {

	static int num;
	static int revNum;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		num = reader.nextInt();
		revNum = reverse(num);
		System.out.println("Reverse Number : " + revNum);//1000000003
	}

	public static int reverse(int number) {
		boolean negativeFlag = false;
		if(number < 0){
			negativeFlag = true;
		}
		number = Math.abs(number);
		long reverseNum = 0;

		while(number != 0){
			int mod = number % 10;
			if (reverseNum * 10 > Integer.MAX_VALUE || reverseNum * 10 < Integer.MIN_VALUE){
				return 0;
			}
			reverseNum = reverseNum * 10 + mod;
			number = number / 10;
		}
		
		if (negativeFlag){
			return (int)reverseNum * -1;
		}
		
		return (int)reverseNum; 

	}
}
