package olddsamixcodes.demo;

import java.util.Arrays;

public class FindTheFarthestValuesFromZero {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 4, 5, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("Distance from 0 is " + arr[arr.length - 1]);

	}

}
