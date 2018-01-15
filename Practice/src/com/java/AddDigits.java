package com.java;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {
	public static void main(String[] args) {
		int result = superPower(25);
		System.out.println(result);
	}
	
	public static int superPower(int z){
		 
        int mid = z/2;
        List<Integer> factors = new ArrayList<Integer>();
        while (z>1){
            for (int i = 2; i <= mid; i++) {
                if (z%i > 0)
                    continue;
                else{
                    z=z/i;
                    factors.add(i);
                    break;
                }
            }
        }
        
        int lastNum = 0;
        int count = 1;
        if(factors.size() == 0){
        	return 0;
        }else{
        	lastNum = factors.get(0);
        }
        //check for factors occurring more than once
        for(int i = 1; i < factors.size(); i++){
        	if(lastNum == factors.get(i)){
        		count++;
        	}else if(count == 1){
        		return 0;
        	}else{
        		count = 1;
        	}
        	lastNum = factors.get(i);
        }
        return 1;
    }
}
