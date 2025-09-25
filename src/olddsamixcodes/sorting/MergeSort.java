package olddsamixcodes.sorting;

/**
 * @author Vishwas
 *
 *         Declare left variable to 0 and right variable to n-1 � Find mid by
 *         medium formula. mid = (left+right)/2 � Call merge sort on (left,mid)
 *         � Call merge sort on (mid+1,rear) � Continue till left is less than
 *         right � Then call merge function to perform merge sort.
 */

/*
 * Algorithm:
 * 
 * step 1: start step 2: declare array and left, right, mid variable step
 * 3:perform merge function. mergesort(array,left,right) mergesort (array,
 * left,right) if left > right return mid= (left+right)/2 mergesort(array, left,
 * mid) mergesort(array, mid+1, right) merge(array, left, mid, right) step 4:
 * Stop
 */
public class MergeSort {

	public static void main(String[] args) {

		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);

	}

	public void sort(int[] arr, int l, int r) {

		if (l < r) {
			int m = l + (r - l) / 2;

			sort(arr, l, m);

			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}

	}

	public void merge(int[] arr, int l, int m, int r) {

		int n1 = m - l + 1;

		int n2 = r - m;

		int[] L = new int[n1];

		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}

		int i = 0, j = 0, k = l;

		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
