package com.java;

public class IsPowerOfTwo {
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1020));
	}

	public static boolean isPowerOfTwo(int n) {
		while(n > 0){
			if(n == 1){
				return true;
			}
			if(n % 2 == 0){
				n /= 2;
			}else{
				return false;
			}
		}
		return false;
	}
}
