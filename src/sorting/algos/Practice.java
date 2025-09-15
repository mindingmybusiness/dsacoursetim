package sorting.algos;

public class Practice {
	
	public static void main(String[] args) {
		int[] array = {20,35,-15,7,55,1,-22};
		selectionSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	public static void bubbleSort(int[] array) {
		for(int lastUnorderedIndex = array.length-1;lastUnorderedIndex>0;lastUnorderedIndex--) {
			for(int i=0;i<lastUnorderedIndex;i++) {
				if(array[i]>array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] array) {
		int largest = 0;
		for(int lastUnsortedIndex = array.length-1;lastUnsortedIndex >=0;lastUnsortedIndex--) {
			for(int i=0;i<lastUnsortedIndex;i++) {
				if(array[i] > array[largest]) {
					largest = i;
				}
			}
			int temp = array[lastUnsortedIndex];
			array[lastUnsortedIndex] = array[largest];
			array[largest] = temp;
		}
	}

}
