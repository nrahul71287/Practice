package com.java;

public class ExcelSheet {
	public int titleToNumber(String s) {
        int result = 0;
        int i = s.length()-1;
        int t = 0;
        while(i >= 0){
            char curr = s.charAt(i);
            result = result + (int) Math.pow(26, t) * (curr-'A'+1);
            t++;
            i--;
        }
        return result;
    }
	
	public static void main(String[] args) {
		ExcelSheet test = new ExcelSheet();
		int result = test.titleToNumber("HQ");
		System.out.println("Result : " + result);
	}
}
