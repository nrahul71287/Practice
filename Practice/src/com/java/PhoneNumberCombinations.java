package com.java;

import java.util.LinkedList;
import java.util.List;

public class PhoneNumberCombinations {

	public static void main(String[] args) {
		PhoneNumberCombinations test = new PhoneNumberCombinations();
		test.letterCombinations("23");
	}
	
	public List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits == null || digits.length() == 0)
            return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        for(int i = 0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length() == i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        return ans;
    }
}
