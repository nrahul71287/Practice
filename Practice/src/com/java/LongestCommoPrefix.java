package com.java;

public class LongestCommoPrefix {
	
	public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
        {
            while(strs[i].indexOf(prefix) != 0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
	
	public static void main(String[] args) {
		LongestCommoPrefix pre = new LongestCommoPrefix();
		pre.longestCommonPrefix(new String[]{"string","str"});
	}
}
