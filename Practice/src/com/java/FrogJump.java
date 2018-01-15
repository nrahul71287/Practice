package com.java;

import java.util.ArrayDeque;
import java.util.Deque;


public class FrogJump {
		static int counter = 0;
		public	int minTime(int A[],int X,int D){
		       int[] steps = new int[X];
		       int cur_pos =0;
		       int result = Integer.MIN_VALUE;
		       for(int i =0;i<X;i++)
		           steps[i] = Integer.MAX_VALUE;
		       steps[0] = Integer.MIN_VALUE;
		       for(int i =0;i<A.length;i++)
		           if(steps[A[i]] == Integer.MAX_VALUE)
		               steps[A[i]] = i;
		       Deque<Pair<Integer,Integer>> jumpWindow = new ArrayDeque<Pair<Integer,Integer>>();
		       
		       for(int i =0;i<X;i++){
		           while(!jumpWindow.isEmpty() && jumpWindow.getLast().getFirst() >= steps[i])
		               jumpWindow.removeLast();
		           jumpWindow.addLast(new Pair(steps[i],i)); //  time,pos
		           while(jumpWindow.getFirst().getSecond() <= i-D)
		               jumpWindow.removeFirst();
		           if(jumpWindow.getFirst().getFirst() == Integer.MAX_VALUE)
		               return -1;
		           if(jumpWindow.getFirst().getFirst() > result)
		               result = jumpWindow.getFirst().getFirst();
		           if(steps[i] <= result && i + D == X)
		               return result;
		           counter++;
		       }
		       System.out.println();
		       return result;
		   }
		
		private class Gap {
	        public int fromPos;
	        public int toPos;

	        public Gap(int from, int to) {
	            fromPos = from;
	            toPos = to;
	        }
	    }
		
		 int solution(int A[], int X, int D) {
		        Gap[] gaps = new Gap[X / D + 1];
		        for (int i = 0; i < gaps.length; i++) {
		            gaps[i] = new Gap(Integer.MAX_VALUE, Integer.MIN_VALUE);
		        }
		        gaps[0].fromPos = 0;
		        gaps[0].toPos = 0;
		        gaps[gaps.length - 1].fromPos = X;
		        gaps[gaps.length - 1].toPos = X;
		        int disconnectedGapsCount = gaps.length - 2;
		        boolean[] isConnected = new boolean[gaps.length];
		        isConnected[0] = true;
		        isConnected[isConnected.length - 1] = true;
		        
		        for (int i = 0; i < A.length; i++) {
		            int currentPos = A[i];
		            int currentPosGap = currentPos / D;
		            gaps[currentPosGap].fromPos = Math.min(gaps[currentPosGap].fromPos, currentPos);
		            gaps[currentPosGap].toPos = Math.max(gaps[currentPosGap].toPos, currentPos);
		            if (currentPosGap == 0 || currentPosGap == gaps.length - 1) {
		                continue;
		            }
		            Gap currentGap = gaps[currentPosGap];
		            Gap previousGap = gaps[currentPosGap - 1];
		            Gap nextGap = gaps[currentPosGap + 1];

		            if ((currentGap.fromPos - previousGap.toPos) <= D && (nextGap.fromPos - currentGap.toPos) <= D  && !isConnected[currentPosGap]) {
		                disconnectedGapsCount--;
		                isConnected[currentPosGap] = true;
		            }
		            if (disconnectedGapsCount <= 0)
		                return i;
		        }
		        return -1;

		        // boolean[] hasLeaf = new boolean[X + 1];
		        // hasLeaf[0] = true;
		        // hasLeaf[X] = true;
		        // int currentPos = 0;
		        // for(int i = 0; i < A.length; i ++){
		        //
		        // }

		    }

	public static void main(String[] args) {
		FrogJump ramp = new FrogJump();
		int A[] = new int[] { 26, 25, 5, 10, 15, 18, 20, 22 };
		int result = ramp.solution(A, 30, 5);
	
		 /*int A[] = new int[] { 1, 3, 1, 4, 2, 5 }; int result =
		  ramp.solution(A, 7, 3);*/
		 
		System.out.println("Result:" + result);
		System.out.println("Counter:" + counter);
	}
}
