package com.java;

public class StringRotation {
	public boolean isRotation(String s1, String s2){
		int l1 = s1.length();
		int l2 = s2.length();
		if((l1 != l2) || l1 ==0 || l2 == 0){
			return false;
		}else{
			String news1 = s1+s1;
			if(news1.contains(s2)){
				return true;
			}else{
				return false;
			}
		}
	}
	public static void main(String[] args) {
		StringRotation strRot = new StringRotation();
		System.out.println(strRot.isRotation("waterbottle", "erbottlewat"));
	}
}
