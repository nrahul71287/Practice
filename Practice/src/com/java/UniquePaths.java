package com.java;

public class UniquePaths {
	public int paths(int m, int n) {
        if(m==0 || n==0) return 0;
        if(m==1 || n==1) return 1;
 
        m--;
        n--;
  
        long factmplusn = factorial(m+n);
        long factm = factorial(m);
        long factn = factorial(n);
        long result = factmplusn/(factm*factn);
        return (int)result;
    }
    
    public int factorial(int num){
        int fact = 1;
        for (int c = 1 ; c <= num ; c++ )
            fact = fact*c;
        return fact;
    }
    
    public static void main(String[] args) {
    	UniquePaths test = new UniquePaths();
    	test.paths(36, 7);
	}
}
