package com.java;

public class IfTest {
	
	//method to check if parameter is null or empty
	public static void checkParameter(String paramToCheck, String strToPrint, String valueToReturn){
		if(paramToCheck == null || paramToCheck.isEmpty()){
			System.out.println("Error:" + strToPrint + " required");
			valueToReturn = null;
		}
	}
	
	public static void bigMethod(){
		//this is only for local test
		String CategoryX3 = null;
		String CurrencyX3 = null;
		String LanguageX3 = null;
		String TaxRuleX3 = null;
		//change valueToReturn with object(if not string) which is returned at the end of this method
		String valueToReturn = "";
		
		checkParameter(CategoryX3, "CategoryX3", valueToReturn);
		checkParameter(CurrencyX3, "CurrencyX3", valueToReturn);
		checkParameter(LanguageX3, "LanguageX3", valueToReturn);
		checkParameter(TaxRuleX3, "TaxRuleX3", valueToReturn);
	}

	public static void main(String[] args){
		bigMethod();
	}
}
