package com.java;

import java.util.HashMap;

public class IsomorphicStrings {
	public boolean isIsomorphic(String s1, String s2) {
		HashMap<Character, Character> map = new HashMap<>();
		
		for(int i = 0; i < s1.length(); i++) {
			char s1Char = s1.charAt(i);
			char s2Char = s2.charAt(i);
			if(map.containsKey(s1Char) && map.get(s1Char) != s2Char) {
				return false;
			} else {
				map.put(s1Char, s2Char);
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
		System.out.println(isomorphicStrings.isIsomorphic("egg", "add"));
		System.out.println(isomorphicStrings.isIsomorphic("foo", "bar"));
		System.out.println(isomorphicStrings.isIsomorphic("paper", "title"));
	}
}
