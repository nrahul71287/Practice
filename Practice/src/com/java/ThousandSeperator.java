package com.java;

public class ThousandSeperator {
	public static void main(String[] args) {
		ThousandSeperator sep = new ThousandSeperator();
		System.out.println("decorated numnber : " + sep.addComma("1000000000"));
	}

	public String addComma(String str) {
		String newStr = str;
		int firstComma = str.indexOf(",");
		if (firstComma < 0)
			firstComma = str.length();
		if (str.length() > 3 && firstComma > 3) {
			newStr = addComma(new StringBuffer(str).insert(firstComma - 3, ",")
					.toString());
		}
		return newStr;
	}
}
