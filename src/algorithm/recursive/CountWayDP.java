package algorithm.recursive;

public class CountWayDP {
	public static int order = 0;

	public int count(int n, int[] map){
		order++;
		if(n < 0) return 0;
		else if(n == 1) return 1;
		else if(map[n] > -1){
			return map[n];
		}
		else{
			map[n] =  count(n-1, map) + count(n-2, map) + count(n-3, map);
			return map[n];
		}
	}
	public static void main(String[] args) {
		int max = 2;
		int[] map = new int[max];
		
		CountWayDP countWayDB = new CountWayDP();
		System.out.println(countWayDB.count(max, map));
		System.out.println(order);
	}

}
