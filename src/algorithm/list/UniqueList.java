package algorithm.list;

import java.awt.List;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

public class UniqueList {

	public static void main(String[] args) {
		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
		LinkedList<Integer> lst = new LinkedList<Integer>();
		Random rnd = new Random();
		for (int i = 0; i < 30; i++) {
			lst.addLast(Math.abs(rnd.nextInt()%10));
		}
		System.out.println(lst);

	}

}
