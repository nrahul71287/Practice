package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSum {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(candidates == null || candidates.length == 0) return result;
		List<Integer> current = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSum(candidates, target, 0, current, result);
		return result;
	}

	public void combinationSum(int[] candidates, int target, int j, List<Integer> curr, List<List<Integer>> result){
		if(target == 0){
			List<Integer> temp = new ArrayList<Integer>(curr);
			result.add(temp);
			return;
		}

		for(int i=j; i<candidates.length; i++){
			if(target < candidates[i]) 
				return;

			curr.add(candidates[i]);
			combinationSum(candidates, target - candidates[i], i, curr, result);
			curr.remove(curr.size()-1); 
		}
	}

	public static void main(String[] args) {
		CombinationSum test = new CombinationSum();
		test.combinationSum(new int[]{2,3,6,7}, 7);
	}

}
