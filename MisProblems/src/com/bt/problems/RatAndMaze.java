package com.bt.problems;

public class RatAndMaze {

	final int N = 4;
	
	private void displaySol(int[][] sol) {
		for (int i =0; i<N; ++i) {
			for (int j =0; j<N; ++j) {
				System.out.print(" " + sol[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void mazeProblem(int arr[][]) {
		
		int sol[][] = {{0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0},
	            {0, 0, 0, 0}
	        };
		if(mazeUtil(arr, 0, 0, sol)) {
			System.out.println("Rate and Maze problem is solved");
			displaySol(sol);
		} else {
			System.out.println("Not possible");
		}		
	}
	private boolean isSafe(int arr[][], int x, int y) {
		if(x>=0 && x< N&& y>=0 && y< N && arr[x][y]==1) {
			return true;
		}
		return false;
	}
	
	private boolean mazeUtil(int arr[][], int x, int y, int sol[][]) {
		
		if(x == N-1 && y == N-1) {
			sol[x][y] =1;
			return true;
		}
		if(isSafe(arr, x, y) == true) {
			sol[x][y] = 1;
			
			if (mazeUtil(arr, x+1, y, sol) == true){
				return true;
			}
			if(mazeUtil(arr, x, y+1, sol) == true) {
				return true;
			}
			
			sol[x][y] = 0;
			return false;
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int maze[][] = {{1, 0, 0, 0},
	            {1, 1, 0, 1},
	            {0, 1, 0, 0},
	            {1, 1, 1, 1}
	        };
		
		RatAndMaze mazeObj = new RatAndMaze();
		mazeObj.mazeProblem(maze);
		
		
	}

}
