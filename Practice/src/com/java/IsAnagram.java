package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IsAnagram {
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        String[] charArr = s.split("");
        String[] anagArray = t.split("");
        Arrays.sort(charArr);
        Arrays.sort(anagArray);
        for(int i = 0; i < charArr.length; i++){
        	if(!(charArr[i].equals(anagArray[i]))){
        		return false;
        	}
        }
        return true;
	}
	
	public static void main(String[] args){
		IsAnagram anag = new IsAnagram();
		boolean anagVal = anag.isAnagram("abc","acb");
		System.out.println(anagVal);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		//loop a Map
		for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
	}
}
