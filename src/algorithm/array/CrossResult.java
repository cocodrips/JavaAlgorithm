package algorithm.array;

import java.sql.Time;
import java.util.Iterator;
import java.util.Random;

public class CrossResult {
	/**
	 * @param array[][]
	 */
	public int[][] hisha(int array[][], int n, int m) {
		boolean boolN[]  = new boolean[n];
		boolean boolM[]  = new boolean[m];
		
		for (int i = 0; i < n; i++) {
			if(!boolN[i]){
				for (int j = 0; j < m; j++) {
					if (boolM[j]) {
						continue;
					}
					if(array[i][j] == 0){
						boolN[i]= true;
						boolM[j]= true;
					}
				}
			}
		}
		array = attack(array, boolN, boolM,  n, m);
		return array;
	}
	
	public int[][] attack(int array[][], boolean boolN[], boolean boolM[], int n, int m){
		for (int i = 0; i < n; i++) {
			if(boolN[i]){
				for (int j = 0; j < m; j++) {
					array[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < m; i++) {
			if(boolM[i]){
				for (int j = 0; j < n; j++) {
					array[j][i] = 0;
				}
			}
		}
		return array;
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 8;
		int m = 5;
		int array[][] = new int[n][m];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Math.abs(rnd.nextInt()%10);
				System.out.print(array[i][j] + " ");				
			}
			System.out.println();
		}System.out.println();


		
		CrossResult cross = new CrossResult();
		int arrayResult[][] = cross.hisha(array, n ,m);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(arrayResult[i][j] + " ");				
			}
			System.out.println();
		}


	}

}
