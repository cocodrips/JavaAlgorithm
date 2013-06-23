package algorithm.array;

import java.util.Random;

public class Cross {
	/**
	 * @param array[][]
	 */
	public int[][] hisha(int array[][], int n, int m) {
		boolean bool[][] = new boolean[n][m];
		
 		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(array[i][j] == 0){
					bool[i][j] = true;
				}else{
					bool[i][j] = false;
				}
			}
		}
		array = attack(array, bool, n, m);
		return array;
	}
	
	public int[][] attack(int array[][], boolean bool[][], int n, int m){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (bool[i][j]) {
					for (int i2 = 0; i2 < n; i2++) {
						array[i2][j] = 0;
					}
					for (int j2 = 0; j2 < m; j2++) {
						array[i][j2] = 0;
					}
					continue;
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
		
		Cross cross = new Cross();
		int arrayResult[][] = cross.hisha(array, n ,m);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(arrayResult[i][j] + " ");				
			}
			System.out.println();
		}
		
	
	}

}
