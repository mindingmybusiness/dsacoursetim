package practiceSorting;

public class SortingTechniques {
	
	public static void main(String[] args) {
		int[] array = { 20, 35, -15, 7, 55, 1, -22 };
//		bubbleSort(array);
//		selectionSort(array);
		insertionSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static void selectionSort(int[] array) {
		for(int i=array.length-1;i>=0;i--) {
			int largest = 0;
			for(int j=0;j<i;j++) {
				if(array[largest]<array[j]) {
					largest = j;
				}
			}
			int temp = array[largest];
			array[largest] = array[i];
			array[i] = temp;
		}
	}

	private static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[j] > array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	
	private static void insertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {
			int temp = array[i];
			int j;
			for(j=i;j>0 && array[j-1]>temp;j--) {
				array[j] = array[j-1];
			}
			array[j]=temp;
		}
	}

}
