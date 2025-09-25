package olddsamixcodes.demo;

import java.util.Arrays;

public class FindTheMedianWIthTheSubArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 1, 6 };
		int[] subArr = Arrays.copyOfRange(arr, 1, 8);
		int n = subArr.length;
		System.out.println(Arrays.toString(subArr));

		for (int i = 0; i < subArr.length; i++) {
			for (int j = 0; j < subArr.length; j++) {
				if (subArr[i] < subArr[j]) {
					int temp = subArr[j];
					subArr[j] = subArr[i];
					subArr[i] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(subArr));
		if (n % 2 == 0) {
			System.out.println("median is : " + subArr[(n - 1) / 2]);

		} else {
			System.out.println("median is : " + subArr[n / 2]);
		}

	}

}
