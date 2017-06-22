package com.bt.problems;

public class SudoKuProblem {

	final int N = 9;
	int row = 0;
	int col = 0;
	final int UNASSIGNED = 0;
	private int arr[][];

	SudoKuProblem(int arr[][]) {
		this.arr = arr;
	}

	private boolean checkRow(int row, int item) {

		for (int i = 0; i < N; ++i) {
			if (this.arr[row][i] == item) {
				return false;
			}
		}
		return true;
	}

	private boolean checkCol(int col, int item) {
		for (int i = 0; i < N; ++i) {
			if (this.arr[i][col] == item) {
				return false;
			}
		}
		return true;
	}

	private boolean checkInBox(int row, int col, int item) {
		for (int i = 0; i < 3; ++i) {
			for (int j = 0; j < 3; ++j) {
				if (this.arr[i + row][j + col] == item) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isSafe(int row, int col, int item) {

		return (checkRow(row, item) && checkCol(col, item) && checkInBox((row - row%3), (col - col%3), item));

	}

	private void displaySudokyu() {
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				System.out.print(" " + this.arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void createSudoku() {
		if (suDoKuUtill(this.arr)) {
			displaySudokyu();
		} else {
			System.out.println("Sudoku not possible");
			displaySudokyu();
		}
	}

	private boolean suDoKuUtill(int[][] arr) {
		
		if (!checkForEmpty()) {
			return true;
		}
		int row = this.row;
		int col = this.col;
		
		for (int i = 1; i <= N; ++i) {
			if (isSafe(row, col, i)) {
				this.arr[row][col] = i;

				if (suDoKuUtill(this.arr)) {
					return true;
				}
				this.arr[row][col] = 0;
			}
		}
		return false;

	}

	private boolean checkForEmpty() {

		for (this.row = 0; this.row < N; ++this.row) {
			for (this.col = 0; this.col < N; ++this.col) {
				if (this.arr[this.row][this.col] == UNASSIGNED) {
					return true;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		SudoKuProblem sudo = new SudoKuProblem(grid);
		sudo.createSudoku();
	}

}
