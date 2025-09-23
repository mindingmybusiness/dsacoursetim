package sorting.algos;

public class MergeSortDesc {
	
	public static void main(String[] args) {
		int[] array = { 20, 35, -15, 7, 55, 1, -22, 70 };
		mergeSortDes(array, 0, array.length);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static void mergeSortDes(int[] array, int start, int end) {
		if (end - start < 2) {
			return;
		}

		int mid = (start + end) / 2;	
		mergeSortDes(array, start, mid);
		mergeSortDes(array, mid, end);
		merge(array, start, mid, end);
	}

	private static void merge(int[] array, int start, int mid, int end) {
		if(array[mid-1] >= array[mid]) {
			return;
		}
		int i=start;
		int j=mid;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		while(i< mid && j<end) {
			temp[tempIndex++] = array[i]>=array[j]?array[i++]:array[j++];
		}
		
		System.arraycopy(array, i, array, start + tempIndex, mid-i);
		System.arraycopy(temp, 0, array, start, tempIndex);
	}

}
