package sorting.algos;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {20,35,-15,7,55,1,-22};
		bubbleSort2(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void bubbleSort(int[] array) {
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
	
	public static void bubbleSort2(int[] array) {
		for(int lastSortedIndex = array.length-1;lastSortedIndex >0;lastSortedIndex--){
			for(int i=0;i<lastSortedIndex;i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
	}


}
