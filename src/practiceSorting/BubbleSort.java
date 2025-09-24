package practiceSorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {-15,6,87,30,6,-22,45};
		bubbleSort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	public static void bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]<=array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}

}
