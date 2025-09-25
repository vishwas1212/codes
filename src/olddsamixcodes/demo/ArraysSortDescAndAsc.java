package olddsamixcodes.demo;

import java.util.Arrays;

public class ArraysSortDescAndAsc {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 10, 14, 15, 16 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
