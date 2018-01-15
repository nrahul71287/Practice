package com.java;

public class TreeDepth {

		public int getTreeDepth(String str) {
			  int depth = 0;
			  String tempStr = str;
			  
			  while(!tempStr.equals("(00)"))  {
				  if(tempStr.indexOf("(00)") == -1)
					  return -1;
				  tempStr = tempStr.replace("(00)", "0");
				  depth++;
			  }
			  return depth;
		  }
		   

	public static void main(String[] args) {
		String s1 = "(00)";     		//0
		String s2 = "((00)0)"; 			// 1
		String s3 = "((00)(00))"; 		// 1
		String s4 = "((00)(0(00)))";	// -> 2
		String s5 = "((00)(0(0(00))))";	// -> 3
		String s6 = "x";				// -> -1
		String s7 = "0";				// -> -1
		String s8 = "()"; 				// -> -1
		String s9 = "(0)";				// -> -1
		String s10 = "(00)x";			// -> -1
		String s11 = "(00000)";			// -> -1*/
		String s12 = "((00)0((0(00))))";			// -> -1*/
		TreeDepth d = new TreeDepth();
		System.out.println(d.getTreeDepth(s1));
		System.out.println(d.getTreeDepth(s2));
		System.out.println(d.getTreeDepth(s3));
		System.out.println(d.getTreeDepth(s4));
		System.out.println(d.getTreeDepth(s5));
		System.out.println(d.getTreeDepth(s6));
		System.out.println(d.getTreeDepth(s7));
		System.out.println(d.getTreeDepth(s8));
		System.out.println(d.getTreeDepth(s9));
		System.out.println(d.getTreeDepth(s10));
		System.out.println(d.getTreeDepth(s11));
		System.out.println(d.getTreeDepth(s12));
	}

}
