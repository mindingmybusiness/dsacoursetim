package sorting.algos;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] array = {20,35,-15,7,55,1,-22};
		insertionSort(array);
//		for(int i=0;i<array.length;i++) {
//			System.out.print(array[i]+ " ");
//		}
	}

	private static void insertionSort(int[] array) {
		for(int firstUnsortedIndex = 1;firstUnsortedIndex<array.length;firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0 && array[i-1]>newElement;i-- ){
				array[i]=array[i-1];
			}
			array[i] = newElement;
			System.out.print(array[0] + "\t" + array[1]+ "\t" + array[2] +"\t"+array[3] + "\t"
					+ array[4] + "\t" + array[5] + "\t" + array[6]);
			System.out.println();
		}
		
	}

}
