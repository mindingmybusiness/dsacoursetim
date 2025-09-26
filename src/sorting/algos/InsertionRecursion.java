package sorting.algos;

public class InsertionRecursion {
	public static void main(String[] args) {
		int[] array = { 20, 35, -15, 7, 55, 1, -22 };
		insertionSort(array, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	public static void insertionSort(int[] array, int numItems) {
		if(numItems <2) {
			return;
		}
		insertionSort(array, numItems-1);
		int newElement = array[numItems-1];
		int i;
		for(i=numItems-1;i>0 && array[i-1]>newElement;i-- ){
			array[i]=array[i-1];
		}
		array[i] = newElement;
		System.out.println("result Of call "+ numItems);
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]);
			System.out.print(", ");
		}
		System.out.println();

		System.out.println("--------------------------");
	}

}
