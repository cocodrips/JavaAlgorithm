package icpc.past.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class RedAndBlack {
	static Scanner scanner;
	static char[][] dyx;
	static int[][] move = {{1,0},{0,-1},{-1,0},{0,1}};
	static boolean[][] result;
	static int w,h;
	
	RedAndBlack() {
		while (true) {
			String[] wh = scanner.nextLine().split(" ",0);
			w = Integer.parseInt(wh[0]);
			h = Integer.parseInt(wh[1]);
			result = new boolean[h][w];
			
			if((w|h) == 0) break;
			
			dyx = new char[h][w];
			for (int i = 0; i < h; i++) {
				dyx[i] = scanner.nextLine().toCharArray();
			}				
			
			for (int y = 0; y < h; y++) {
				for (int x = 0; x < w; x++) {
					if(dyx[y][x] == '@'){
						int ans = count(y,x);
						System.out.println(ans);
					}
				}
			}
		}		
	}
	
	static int count(int y, int x){
		int res = 1;
		result[y][x] = true;
		for (int i = 0; i < move.length; i++) {
			int yy = y + move[i][0];
			int xx = x + move[i][1];
			if (0 <= yy && yy < h && xx >= 0&& xx < w && dyx[yy][xx] == '.'&& result[yy][xx]==false) {
				res += count(yy,xx);
			}
		}
		return res;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("input/redandblack.txt");
		scanner = new Scanner(inputStream);
		new RedAndBlack();
	}

}
