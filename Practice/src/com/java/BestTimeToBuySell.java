package com.java;

public class BestTimeToBuySell {
	
	public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
	
	public static void main(String[] args) {
		int[] prices = new int[]{1, 7, 4, 11};
		BestTimeToBuySell test = new BestTimeToBuySell();
		System.out.println(test.maxProfit(prices));
	}
}
