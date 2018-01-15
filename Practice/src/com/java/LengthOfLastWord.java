package com.java;

public class LengthOfLastWord {
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(" "));
	}

	public static int lengthOfLastWord(String s) {
		if(s.isEmpty()){
			return 0;
		}
		String[] strArray = s.split(" ");
		if(strArray.length > 0){
			String word = strArray[strArray.length - 1];
			return word.length();

		}
		return 0;
	}
}
