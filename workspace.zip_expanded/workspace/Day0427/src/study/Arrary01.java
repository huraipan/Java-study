package study;

import java.util.Arrays;

public class Arrary01 {

	public static void main(String[] args) {
		int [][] array;
		array = new int [4][5];
		
		
		int k=20;
		for (int i=0;i<4;i++) {			
			for (int j=0; j<5;j++) {
//				array [0][j]=20;
//				array [1][j]=19;
//				array [2][j]=18;
//				array [3][j]=17;
//				
		     array [i][j]=k;
		     k-=4;
//             k=19;
//             array [1][j]=19;
//             k-=4;
				
			
			}
		}
		
		
		for (int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
			
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
		}

	}

}
