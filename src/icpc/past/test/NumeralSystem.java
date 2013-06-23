package icpc.past.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class NumeralSystem {

	static Scanner scanner;

	NumeralSystem() {
		int questionNum = scanner.nextInt();
		int count = 0;
		scanner.nextLine();
		while(count < questionNum){
			String line = scanner.nextLine();
			String[] num = line.split(" ",0);
			calc(num);
			count++;
		}
	}
	
	void calc(String[] num){
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			result += translater(num[i]);
		}
		System.out.println(sTranslater(result));
		
	}
	
	int translater(String num){
		int result = 0;
		int prevNum = 1;
		
		for (int i = 0; i < num.length(); i++) {
			switch (num.charAt(i)) {
			case 'm':
				result += prevNum * 1000;
				prevNum = 1;
				break;
			case 'c':
				result += prevNum * 100;
				prevNum = 1;
				break;
			case 'x':
				result += prevNum * 10;
				prevNum = 1;
				break;
			case 'i':
				result += prevNum ;
				prevNum = 1;
				break;
			default:
				prevNum = Integer.parseInt(num.charAt(i)+"");
				break;
			}
		}		
		return result;
	}
	
	String sTranslater(int num){
		String strNum = Integer.toString(num);
		String result = "";
		char[] markArray = {'i', 'x', 'c', 'm'};
		int len = strNum.length() - 1;
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i) != '0') {
				if (strNum.charAt(i) != '1') {
					result += strNum.charAt(i);
				}
				result += markArray[len];		
			}
			len--;
		}
		return result;
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("input/numeral.txt");
		scanner = new Scanner(inputStream);
		new NumeralSystem();
	}

}
