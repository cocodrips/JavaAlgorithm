package algorithm.recursive;

public class CountWay {
	public static int order = 0;
	public int count(int n){
		order++;
		if(n < 0) return 0;
		else if(n == 1) return 1;
		else{
			return count(n-1) + count(n-2) + count(n-3);
		}
	}
	public static void main(String[] args) {
		CountWay countWay = new CountWay();
		System.out.println(countWay.count(36));
		System.out.println(order);
	}

}
