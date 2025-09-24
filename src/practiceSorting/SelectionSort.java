package practiceSorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array = {-15,6,87,30,6,-22,45};
		selectionSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}

	private static void selectionSort(int[] array) {
		
		for(int i=array.length-1;i>=0;i--) {
			int largest = 0;
			for(int j=0;j<i;j++) {
				if(array[largest] <=array[j]) {
					largest = j;
				}
			}
			int temp = array[largest];
			array[largest] = array[i];
			array[i] = temp;
		}
		
	}

}
