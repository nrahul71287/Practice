package com.java;

public class MatrixRotation {
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int layer = 0;layer<n/2;layer++)
		{
			int first = layer;
			int last = n-layer-1;
			for(int i=0;i<last-first;i++)
			{
				// save top
				int top = matrix[first][first+i];
				// left->top
				matrix[first][first+i] = matrix[last-i][first];
				// bottom->left
				matrix[last-i][first] = matrix[last][last-i];
				//right -> bottom
				matrix[last][last-i] = matrix[first+i][last];
				//top -> right
				matrix[first+i][last] = top;
			}
		}
	}

	public static void main(String[] args) {
		MatrixRotation rot = new MatrixRotation();
		int[][] matrix = new int[][]{
				  { 0, 1, 2},
				  { 10, 11, 12},
				  { 20, 21, 22}
				};
		rot.rotate(matrix);
		for(int i=0; i< matrix.length; i++){
			for(int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
