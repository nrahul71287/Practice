package com.java;

import java.util.*;

public class StringCombinations {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Hello, World!");
		strings.add("Welcome to CoderPad.");
		strings.add("This pad is running Java 8.");

		Vector<Vector<String>> inputVector = new Vector<Vector<String>>();
		//sample test for 3 vectors, this can be changed to any number of vectors
		Vector<String> vector1 = new Vector<String>();
		vector1.add("quick");
		vector1.add("lazy");
		Vector<String> vector2 = new Vector<String>();
		vector2.add("brown");
		vector2.add("black");
		vector2.add("grey");
		Vector<String> vector3 = new Vector<String>();
		vector3.add("fox");
		vector3.add("dog");
		
		inputVector.add(vector1);
		inputVector.add(vector2);
		inputVector.add(vector3);
		
		printStringCombinations(inputVector);
	}

	public static void printStringCombinations(Vector<Vector<String>> inputVector){
		Queue<Vector<String>> resultQueue = new LinkedList<Vector<String>>();
	    resultQueue.add(new Vector<String>());
	    for(int i = 0; i < inputVector.size(); i++){
	      while(resultQueue.peek().size() == i){
	        Vector<String> vectorOfString = resultQueue.poll();
	        for(String appendStr:inputVector.get(i)){
	          Vector<String> newVectorOfString = new Vector<String>(vectorOfString);
	          newVectorOfString.add(appendStr);
	          resultQueue.add(new Vector<>(newVectorOfString));
	        }
	      }
	    }
	    
	    System.out.println();
	    System.out.println("Result for given vectors is : \n");

		for(List<String> listStr:resultQueue){
			for(String str:listStr){
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}
}

//result
//-8 -9 -10 -19 1 2 9 6 8