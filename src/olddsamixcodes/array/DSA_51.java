package olddsamixcodes.array;

import java.util.Scanner;

/**
 * @author Vishwas Difference of an array
 *
 */
public class DSA_51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int[] a1 = new int[n1];

		for (int i = 0; i < a1.length; i++) {
			a1[i] = scan.nextInt();
		}

		int n2 = scan.nextInt();
		int[] a2 = new int[n2];

		for (int i = 0; i < a2.length; i++) {
			a2[i] = scan.nextInt();
		}

		int[] diff = new int[n2];
		int c = 0;

		int i = a1.length - 1;
		int j = a2.length - 1;
		int k = diff.length - 1;

		while (k >= 0) {
			int d = 0;

			int a1v = i >= 0 ? a1[i] : 0;
			
			if (a2[j] + c >= a1v) {

				d = a2[j] + c - a1v;
				c = 0;
				
			} else {

				d = a2[j] + c + 10 - a1v;
				c = -1;
				
			}

			diff[k] = d;
		
			i--;
			j--;
			k--;
		}

		System.out.println(diff.length);
		
		int idx = 0;
		while (idx < diff.length) {
			
			if (diff[idx] == 0) {
				idx++;
			} else {
				break;
			}
		}

		while (idx < diff.length) {
			System.out.println(diff[idx]);
			idx++;
		}

	}

}
