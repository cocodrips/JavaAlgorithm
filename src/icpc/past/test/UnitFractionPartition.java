package icpc.past.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class UnitFractionPartition {
	static Scanner scanner;
	int p,q,a,n;
	int count = 0;
	
	UnitFractionPartition(){
		while (true) {
			p = scanner.nextInt();
			q = scanner.nextInt();
			a = scanner.nextInt();
			n = scanner.nextInt();
			if((p|q|a|n)==0) break;
			int ans = calc(0,1,1,0);
			System.out.println("ans "+ans);
		}		
	}
	int calc(int p2,int q2,int c,int n_count) {
		int count = 0;
		if(q * p2  == p*q2){
			count++;
			return count;
		}
		if(n_count == n) return 0;
		if(p*q2 < p2*q) return 0;
		for (int i = c; i*q2 <= a; i++) {
			int cc = q2 + p2 * i;
			int bb = q2 * i;
			count += calc(cc, bb, i, n_count+1);			
		}
		return count;
	}
		
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("input/partitiona.txt");
		scanner = new Scanner(inputStream);
		
		new UnitFractionPartition();
	}
}
