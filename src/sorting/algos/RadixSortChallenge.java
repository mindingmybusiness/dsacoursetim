package sorting.algos;

public class RadixSortChallenge {
	
	public static void main(String[] args) {
		String[] str = {"bcdef","dbaqc","abcde","omadd","bbbbb"};
		radixSort(str, 26, 5);
		for(String s:str) {
			System.out.println(s);
		}
	}
	
	public static void radixSort(String[] str, int radix, int width) {
		for (int i = width-1; i >=0; i--) {
			radixSingleSort(str, i, radix);
		}
	}
	
	private static void radixSingleSort(String[] input, int position, int radix) {
		int numItems = input.length;
		int[] countArray = new int[radix];
		for (String value : input) {
			countArray[getIndex(position, value)]++;
		}
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j - 1];
		}
		String[] temp = new String[numItems];
		for (int k = (numItems - 1); k >= 0; k--) {
			temp[--countArray[getIndex(position, input[k])]] = input[k];
		}
		
		for(int tempIndex =0;tempIndex<numItems;tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}
	
	public static int getIndex(int position, String str) {
		return str.charAt(position) - 'a';
	}

	
}
