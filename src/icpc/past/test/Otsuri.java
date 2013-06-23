package icpc.past.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class Otsuri {
	static Scanner scanner;
	int COIN_NUM = 4;
	int[] coinValue = new int[]{10, 50, 100, 500};

	Otsuri() {
		while(true){
			int value = scanner.nextInt();
			if(value == 0) break;
			int[] coin = new int[COIN_NUM];
			for (int i = 0; i < COIN_NUM; i++) {
				coin[i] = scanner.nextInt();	
			}
			calc(value, coin);

		}
	}
	
	void calc(int value, int[] coin){
		int total = 0;
		int[] result = new int[COIN_NUM];
		
		for (int i = 0; i < COIN_NUM; i++) {
			total += coin[i] * coinValue[i];
		}
		
		int otsuri = total - value;

//		‚à‚¤‚¿‚å‚Á‚Æ‘‚«•û‚Ç‚¤‚É‚©‚µ‚½‚¢
		result[3] = otsuri / 500;
		result[2] = otsuri % 500 / 100;
		result[1] = otsuri % 500 % 100 / 50;
		result[0] = otsuri % 500 % 100 % 50 / 10;
		
		for (int i = 0; i < result.length; i++) {
			if (coin[i] - result[i] > 0) {
				System.out.print(coinValue[i] + " ");
				System.out.println(coin[i] - result[i]);
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("input/otsuri.txt");
		scanner = new Scanner(inputStream);
		new Otsuri();
	}

}
