package algorithm.sort;

public class MergeSort {

	void mergeSort(int[] array, int low, int high){
		if(low < high){
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, high);
			merge(array, low, middle, high);
		}	
	}
	
	void merge(int[] array, int low, int middle, int high){
		int[] helper = new int[array.length];
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle+1;
		int current = low;
		
		while (helperLeft <= middle && helperRight <=high) {
			if(helper[helperLeft] <= helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
				
			}else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current ++;
			
		}
		
		int remaining = middle - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[current+i] = helper[helperLeft+ i];
		}
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] array = new int[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length-1 - i;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		MergeSort m = new MergeSort();
		m.mergeSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end - start + "");
	}

}
