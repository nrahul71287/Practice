package com.java;

public class UniqueChar {

	public boolean testString(String test){
		boolean flag = true;
		if(test.isEmpty() || test == null){
			return false;
		}
		
		for(int i = 0; i<test.length(); i++){
			for(int j = 0; j<i; j++){
				if(test.charAt(j) == test.charAt(i)){
					flag = false;;
				}
			}
		}
		return flag;
	}//or method to split string in array,sort it and check in a for loop(O(n))
	
	public static void main(String[] args) {
		UniqueChar uniChar = new UniqueChar();
		System.out.println(uniChar.testString("abckji"));
	}

}
