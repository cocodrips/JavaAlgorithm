package algorithm.sort;

public class BinarySearch {
	
	int binarySearch(int[] array, int x){
		int low = 0;
		int high = array.length-1;
		int mid;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if(array[mid]< x){
				low = mid + 1;
			}else if(array[mid] > x){
				high = mid - 1;
			}else {
				return mid;
			}
			
		}
		return -1;
	}
	
	int binarySearchRecursive(int[] array, int x, int low, int high){
		if(low > high) return -1;
		int mid = (low + high) / 2;
		if (array[mid] < x) {
			return binarySearchRecursive(array, x, mid + 1, high);
		}else if(array[mid] > x){
			return binarySearchRecursive(array, x, low, mid - 1);
		}else{
			return mid;
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] array = new int[100000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i * 2;
			System.out.print(array[i] + " ");
		}System.out.println();
		
		BinarySearch b = new BinarySearch();
		System.out.println(b.binarySearchRecursive(array, 50, 0, array.length-1));
		long end = System.currentTimeMillis();
		System.out.println(end - start + "");
	}

}
