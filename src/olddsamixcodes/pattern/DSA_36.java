package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Print W
 *
 */
public class DSA_36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				/*
				 * if (i == 1) { if (j == 1 || j == n) { System.out.print("*\t"); } else {
				 * System.out.print("\t"); }
				 * 
				 * } else if (i <= n / 2) {
				 * 
				 * if (j == 1 || j == n) { System.out.print("*\t"); } else {
				 * System.out.print("\t"); }
				 * 
				 * } else if (i == n / 2 + 1) {
				 * 
				 * if (j == 1 || j == n || j == n / 2 + 1) { System.out.print("*\t"); } else {
				 * System.out.print("\t"); }
				 * 
				 * } else if (i < n) {
				 * 
				 * if (j <= n / 2 || j == n || j > n / 2 + 1) { System.out.print("*\t"); } else
				 * { System.out.print("\t"); }
				 * 
				 * } else {
				 * 
				 * if (j == 1 || j == n) { System.out.print("*\t"); } else {
				 * System.out.print("\t"); }
				 * 
				 * } } System.out.println(); }
				 */

				if (j == 1 || j == n) {
					System.out.print("*\t");
				}

				else if (i > n / 2 && (i == j || i + j == n + 1)) {

					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}

			}
			System.out.println();
		}

	}

}
