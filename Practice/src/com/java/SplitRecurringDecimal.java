package com.java;

import java.util.HashMap;

public class SplitRecurringDecimal {
	public String formatDecimal(int n){
		if(n == 0){
			return "invalid";
		}
		
		String formattedStr = "";
		
		if (n < 0) {
			formattedStr += "-";
		}
		
		n = Math.abs(n);
		int res = 1 / n;
		formattedStr += String.valueOf(res);
	 
		int remainder = (1 % n) * 10;
		if (remainder == 0)
			return formattedStr;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		formattedStr += ".";
		while (remainder != 0) {
			if (map.containsKey(remainder)) {
				int start = map.get(remainder); 
				String normal = formattedStr.substring(0, start);
				String recurring = formattedStr.substring(start, formattedStr.length());
				formattedStr = normal + recurring + " " + recurring;
				return formattedStr;
			}
	 
			map.put(remainder, formattedStr.length());
			res = remainder / n;
			formattedStr += String.valueOf(res);
			remainder = (remainder % n) * 10;
		}
		formattedStr = formattedStr + "0 0";
		return formattedStr;
	}
	
	public static void main(String[] args) {
		SplitRecurringDecimal dec = new SplitRecurringDecimal();
		//System.out.println(dec.formatDecimal(10));
		//System.out.println(dec.formatDecimal(-3));
		System.out.println(dec.formatDecimal(88));
		//System.out.println(dec.formatDecimal(112));
	}
}
