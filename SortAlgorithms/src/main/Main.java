package main;

import java.util.Arrays;

import algorithms.insertion.InsertionSort;
import algorithms.merge.MergeSort;

public class Main {
	public static int[] randomIntArray(final int length) {
		final int[] arr = new int[length];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = randomIntArray(10);
		System.out.println("Insertionsort");
		System.out.println("Before sorting: " + Arrays.toString(arr));
		InsertionSort.sort(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));

		System.out.println();
		
		System.out.println("Mergesort");
		arr = randomIntArray(10);
		System.out.println("Before sorting: " + Arrays.toString(arr));
		MergeSort.sort(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
}
