package com.java;


public class PowerOfTwo {

	public static void main(String[] args) {
		PowerOfTwo pot = new PowerOfTwo();
		boolean isPowerTwo = pot.isPowerOfTwo(5);
		System.out.println("Is power of two : " + isPowerTwo);
		
		boolean isPowerThree = pot.isPowerOfThree(244);
		System.out.println("Is power of three : " + isPowerThree);
	}

	public boolean isPowerOfTwo(int n) {
		if(n<=0) 
	        return false;
	 
	    while(n>2){
	        int t = n>>1;
	        int c = t<<1;
	 
	        if(n-c != 0)
	            return false;
	 
	        n = n>>1;
	    }
	 
	    return true;
	}
	
	public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
