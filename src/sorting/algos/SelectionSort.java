package sorting.algos;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = {20,35,-15,7,55,1,-22};
		selectionSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}

	private static void selectionSort(int[] array) {
		
		for(int lastUnsortedIndex = array.length-1;lastUnsortedIndex >0 ; lastUnsortedIndex--) {
			int max = 0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(array[i] > array[max]) {
					max = i;
				}
			}
			int temp = array[lastUnsortedIndex];
			array[lastUnsortedIndex] = array[max];
			array[max] = temp;
		}
	}
	
	

}
