package com.java;

import java.util.Scanner;

public class UglyNumber {
	public static void main(String[] args) {
		int total;
		Scanner in = new Scanner(System.in);
		total = in.nextInt();
		//print ugly number
		System.out.println(uglyNum(total));
		in.close();
	}

	public static boolean uglyNum(int num) {
		if(num < 1) return false;
	    while(num % 2 == 0){ 
	    	num = num / 2;
	    }
	    while(num % 3 == 0){ 
	    	num = num / 3;
	    }
	    while(num % 5 == 0){ 
	    	num = num / 5;
	    }
	    return num == 1;
	}
}
