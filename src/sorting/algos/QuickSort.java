package sorting.algos;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = { 20, 35, -15, 7, 55, 1, -22, 70 };
		quickSort(array, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		if(end-start <2) {
			return;
		}
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot);
		quickSort(array, pivot+1, end);
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[start];
		int i=start;
		int j=end;
		while(i<j) {
			while(i < j && array[--j] >= pivot); 
			if(i < j) {
				array[i] = array[j];
			}
				
			while(i<j && array[++i] <= pivot); 
			if(i<j) {
				array[j] = array[i];
			}
			
		}
		array[j] = pivot;
		return j;
	}
	
	

}
