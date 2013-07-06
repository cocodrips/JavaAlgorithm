package algorithm.recursive;

import java.util.ArrayList;

public class Combination {
	
	ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allSubsets;
		
		if(set.size() == index){
			allSubsets = new ArrayList<ArrayList<Integer>>();
			allSubsets.add(new ArrayList<Integer>());	//空集合追加
		}else{
			allSubsets = getSubsets(set, index+1);
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubset = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> subset : allSubsets) {
				ArrayList<Integer> newSubset = new ArrayList<Integer>();
				newSubset.addAll(subset);	//いままでの全部いれたのと
				newSubset.add(item);		//新しい数字をたして
				moreSubset.add(newSubset);	//新しいArrayListを作ってmoreにいれる！
			}
			allSubsets.addAll(moreSubset);
		}
		return allSubsets;
	}

	public static void main(String[] args) {
		Combination combination = new Combination();
		ArrayList<Integer> set = new ArrayList<Integer>();
		for (int i = 0; i < 2; i++) {
			set.add(i);
		}
		System.out.println(combination.getSubsets(set, 0));

	}

}
