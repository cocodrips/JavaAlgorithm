package icpc.past.test;

import java.awt.CardLayout;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Hanafuda {
	static Scanner scanner;
	Stack<Integer> card;
	
	Hanafuda(){
		int n,r;
		while (true) {
			n = scanner.nextInt();
			r = scanner.nextInt();
			
			if(n == 0) break;
//			ƒJ[ƒh‰Šú‰»
			card = new Stack<Integer>();
			for (int i = 0; i < n; i++) {
				card.push(i + 1);
			}
			
			for (int i = 0; i < r; i++) {
				int p = scanner.nextInt();
				int c = scanner.nextInt();
				shuffle(p,c);
			}
			System.out.println(card.peek());
		}
	}
	

	
	public void shuffle(int p, int c) {
		LinkedList<Integer> pl = new LinkedList<Integer>();
		LinkedList<Integer> cl = new LinkedList<Integer>();
		
		for (int i = 0; i < p-1; i++) {
			pl.offer(card.pop());
		}
		
		for (int i = 0; i < c; i++) {
			cl.offer(card.pop());
		}
		
		for (int i = 0; i < p-1; i++) {
			card.push(pl.getLast());
			pl.removeLast();
		}
		
		for (int i = 0; i < c; i++) {
			card.push(cl.getLast());
			cl.removeLast();
		}
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		InputStream inputStream = new FileInputStream("input/hanafuda.txt");
		scanner = new Scanner(inputStream);
		
		new Hanafuda();
	}
}
