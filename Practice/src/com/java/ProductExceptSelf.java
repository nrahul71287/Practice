package com.java;

public class ProductExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
        	totalProduct = 1;
            for(int j = 0; j < nums.length; j++){
                if(i == j){
                    continue;
                }
                else{
                   totalProduct *=  nums[j];
                   
                }
            }
            result[i] = totalProduct;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		ProductExceptSelf test = new ProductExceptSelf();
		test.productExceptSelf(new int[]{1,2,3,4});
	}
}
