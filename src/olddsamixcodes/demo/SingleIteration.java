package olddsamixcodes.demo;

import java.util.Arrays;

public class SingleIteration {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 7, 8, 9, 6, 4, 5, 1, 2, 3, 6, 5, 4, 7, 8 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}
		System.out.println(Arrays.toString(arr));

		int[] arr1 = { 2, 3, 4, 7, 8, 9, 6, 4, 5, 1, 2, 3, 6, 5, 4, 7, 8 };
		for (int i = 0; i < arr1.length-1; i++) {
			if (arr1[i + 1] > arr1[i]) {
				int temp = arr1[i + 1];
				arr1[i + 1] = arr1[i];
				arr1[i] = temp;
				i = -1;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
