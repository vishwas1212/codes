package olddsamixcodes.array;

import java.util.Scanner;

/**
 * @author Vishwas Find element in the array
 *
 */
public class DSA_48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int d = scan.nextInt();
		int idx = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == d) {
				idx = i;
				break;
			}
		}
		System.out.println(idx);

	}

}
