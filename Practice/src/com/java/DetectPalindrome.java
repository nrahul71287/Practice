package com.java;

/**
 * @author Rahul Nakkanwar 
 * This class is to check whether a string is palindrome or not
 */
public class DetectPalindrome {

	/**
	 * @param strToCheck
	 *            - String which needs to be tested for palindrome
	 * @return whether a string is palindrome or not as boolean value
	 */
	public boolean isPalindrome(String strToCheck) {
		if (null == strToCheck || strToCheck.isEmpty()) {
			return false;
		}
		// replace all non alphanumeric characters with empty string using
		// regular expression
		strToCheck = strToCheck.replaceAll("[^A-Za-z0-9]", "");
		strToCheck = strToCheck.toLowerCase();

		for (int startIndex = 0, endIndex = strToCheck.length() - 1; endIndex > startIndex; startIndex++, endIndex--) {
			if (strToCheck.charAt(startIndex) != strToCheck.charAt(endIndex)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Main method to test palindrome functionality
	 * @param args - String arguments
	 */
	public static void main(String[] args) {
		DetectPalindrome detectPalindrome = new DetectPalindrome();
		boolean result = detectPalindrome.isPalindrome("poppop");
		if (result) {
			System.out.println("Given string is a palindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}
	}
}
