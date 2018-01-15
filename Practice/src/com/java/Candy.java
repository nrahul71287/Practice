package com.java;

public class Candy {

	static int distributeCandy(int[] score) {
		//System.out.println(score.length);

		int[] left=new int[score.length];
		int[] right=new int[score.length];
		// for left array
		for(int i=1; i<score.length; i++)
		{
			if(score[i]>score[i-1])
			{
				left[i]=left[i-1]+1;
			}
			else
				left[i]=0;
		}
		// for right array
		for(int i=score.length-2; i >= 0; i--)
		{
			if(score[i]>score[i+1])
			{
				right[i]=right[i+1]+1;
			}
			else
				right[i]=0;
		}
		int sum=0;
		for(int i=0;i<score.length;++i)
		{
			sum = sum + Math.max(right[i],left[i]);

		}
		sum =sum + score.length;
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(distributeCandy(new int[]{2,4,2,6,1,7,8,9,2,1}));
	}

}
