package com.dp.problem;

public class WayToGetFromLeftToRight {

	public static void main(String[] args) {
		int ROW = 10;
		int COL = 20;
		int arr[][] = new int [][]{
			{1,1,1,1,1},
			{1,1,1,1,1}
		};
		int temp;
		if(ROW < COL) {
			/*temp = ROW;
			ROW = COL;
			COL = ROW;*/
			
			ROW = ROW ^ COL;
			COL = ROW ^ COL;
			ROW = ROW ^ COL;
		}
		for (int i = 1; i <ROW; ++i) {
			for (int j = 0; j <COL; ++j) {
				arr[i &  1][j] = (i < 1 ? 0 : arr[ (i-1)&1][j]) + 
						(j <1 ? 0 : arr[i&1][j-1]);
			}
		}
		System.out.println(arr[(ROW -1 ) & 1] [COL -1]);

	}

}
