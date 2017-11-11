package algorithms.merge;

public class MergeSort {
	
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}
	
	/**
	 * Recursively divideds the array in smaller and smaller subarrays, until the
	 * subarrays length is 1. Since an array with only one element is always sorted,
	 * it then passes two subarrays with length 1 to the merge method, merging it
	 * into a sorted subarray of length 2.
	 * It then goes back upwards and merges two arrays with size 2 so the results
	 * is a sorted array of length 4 and so on...
	 * 
	 * @param arr
	 * @param start
	 * @param end
	 */
	public static void sort(int[] arr, int start, int end) {
		if(start < end) {
			int middle = start + ((end - start) / 2);
			
			sort(arr, start, middle);
			sort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
	}
	
	/**
	 * Takes in an array and merges two subarrays of this array.
	 * One subarray goes from 'start' to 'middle' and the other from 'middle'+1 to 'end'
	 * Both subarrays have to be sorted if the result is supposed to be a sorted array 
	 * 
	 * 
	 * @param arr		the array that should be sorted
	 * @param start		the position from where the array should start to be sorted
	 * @param middle	an element dividing the array that will be sorted in two subarrays
	 * @param end		the last element included in the subarray that will be sorted
	 */
	public static void merge(final int[] arr, int start, int middle, int end) {
		int lengthLeft = middle - start + 1;
		int lengthRight = end - middle;
		
		int[] left = new int[lengthLeft + 1];
		left[lengthLeft] = Integer.MAX_VALUE;
		int[] right = new int[lengthRight + 1];
		right[lengthRight] = Integer.MAX_VALUE;
		
		for(int indexLeft = 0; indexLeft < lengthLeft; indexLeft++) {
			left[indexLeft] = arr[start + indexLeft];
		}
		
		for(int indexRight = 0; indexRight < lengthRight; indexRight++) {
			right[indexRight] = arr[middle + indexRight + 1];
		}
		
		for(int indexLeft = 0, indexRight = 0, i = start; i <= end ; i++) {
			if(left[indexLeft] <= right[indexRight]) {
				arr[i] = left[indexLeft];
				indexLeft++;
			} else {
				arr[i] = right[indexRight];
				indexRight++;
			}
		}
	}
}