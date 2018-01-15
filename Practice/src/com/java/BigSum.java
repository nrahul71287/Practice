package com.java;

import java.util.Scanner;

public class BigSum {
	public static void main(String[] args) {
		int totalNum;
		int num;
		long sum = 0;
        Scanner in = new Scanner(System.in);
        totalNum = in.nextInt();
        
        for(int i = 0; i < totalNum; i++){	
        	num = in.nextInt();
        	sum = sum + num;
        }
        System.out.println(sum);
        in.close();
    }
}
