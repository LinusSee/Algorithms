package algorithms.insertion;

public class InsertionSort {
	
	public static void sort(final int[] arr) {
		for(int j = 1; j < arr.length; j++) {
			int val = arr[j];
			int i = j - 1;
			for(; i >= 0 && arr[i] > val; i--) {
				arr[i + 1] = arr[i];
			}
			arr[i + 1] = val;
		}
	}
}
