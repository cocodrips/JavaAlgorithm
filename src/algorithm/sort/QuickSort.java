package algorithm.sort;

public class QuickSort {
	
	void quickSort(int[] array, int left, int right){
		int index = partition(array, left, right);
		if(left < index - 1){
			quickSort(array, left, index - 1);
		}
		if(index < right){
			quickSort(array, index, right);
		}
	}
	
	int partition(int[] array, int left, int right){
		int pivot = array[(left + right)/2];
		while (left < right) {
			while (array[left] < pivot) left++;
			while(array[right] > pivot) right --;
			if(left <= right){
				int tmp = array[left];
				array[left] = array[right];
				array[right] = tmp;
				left ++;
				right --;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] array = new int[10000];
		for (int i = 0; i < array.length; i++) {
			array[i] = array.length-1 - i;
		}
		System.out.println();
		QuickSort q = new QuickSort();
		q.quickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end - start + "");
	}


}
