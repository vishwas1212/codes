package olddsamixcodes.demo;

import java.util.Arrays;

public class DuplicateArraySort {

	public static void main(String[] args) {
		int[] arr = new int[] { 7, 7, 7, 7, 7, 7, 4, 4, 4, 4, 3, 3, 3, 2, 2, 1 };
		int[] arr1=new int[]{1,2,3,3,4,5,5};
		int[] arr2=	{7,5,3,5,3,3,5,7,7,7,7,5,5,5,3};
		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));

	}

}
