package olddsamixcodes.array;

import java.util.Scanner;

/**
 * @author Vishwas Span of the Array
 *
 */
public class DSA_47 {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Max Value = " + max + "\tMin Value =" + min);
		int span = max - min;
		System.out.println("Span Of The Given Array\t"+span);

		/*
		 * int[] arr = new int[7];
		 * 
		 * arr[0] = 6; arr[1] = 15; arr[2] = 30; arr[3] = 40; arr[4] = 4; arr[5] = 11;
		 * arr[6] = 9;
		 * 
		 * int max = 0; int min = arr[0]; for (int i = 0; i < arr.length; i++) { if (max
		 * < arr[i]) { max = arr[i]; }
		 * 
		 * }
		 * 
		 * minVal(arr, min);
		 * 
		 * }
		 * 
		 * private static void minVal(int[] arr, int min) {
		 * 
		 * for (int i = 1; i < arr.length; i++) { if (arr[i] < min) {
		 * 
		 * min = arr[i];
		 * 
		 * } } System.out.println(min);
		 */

	}

}
