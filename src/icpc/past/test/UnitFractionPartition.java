package icpc.past.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class UnitFractionPartition {
	static Scanner scanner;
	
	UnitFractionPartition(){
		while (true) {
			int p,q,a,n;
			p = scanner.nextInt();
			q = scanner.nextInt();
			a = scanner.nextInt();
			n = scanner.nextInt();
			
			if((p || q || a || n)==0) break;
			ans = calc(p, q, a, n);
		}		
	}
	int calc() {
		int result;
		
		
		return result;
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("input/partitiona.txt");
		scanner = new Scanner(inputStream);
		
		new UnitFractionPartition();
	}
}
