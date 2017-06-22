package com.bt.problems;

	
public class NQueensProblem {

	public static int N =4;
	public static void main(String[] args) {
	
		int arr[][] = {{0,0,0,0},
				{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		
		if(setQueen(arr, 0)) {
			printQueen(arr);
		} else {
			System.out.println("No solution possible");
		}

	}
	
	public static boolean isSafe(int arr[][], int ROW, int COL) {
	
		for ( int i =0; i<COL; ++i) {
			if(arr[ROW][i] == 1) {
				return false;
			}
		}
		//for lower left diagnoal 
		
		for (int i = ROW, j = COL; i < N && j >=0; ++i, --j) {
			if(arr[i][j] == 1) {
				return false;
			}
		}
		//for upper left diagnoal 
		
		for (int i = ROW, j = COL; i >= 0 && j >= 0; --i, --j) {
			if(arr[i][j] == 1) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean setQueen(int arr[][], int col) {
		
		if(col >= N) {
			return true;
		}
		for (int i =0; i < N; ++i) {
			if(isSafe(arr, i, col)) {
				arr[i][col] = 1;
				
				if(setQueen(arr, col+1)) {
					return true;
				}
				arr[i][col] = 0;
			}
		}
		
		return false;
	}
	
	public static void printQueen(int arr[][]){
		for (int i = 0; i <N; ++i) {
			for (int j=0; j<N; ++j) {
				System.out.print(" " +arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
