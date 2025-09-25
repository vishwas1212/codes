package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Patterna Programming
 *
 */
public class DSA_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sp = 0;
		int st = n;

		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= sp; k++) {

				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {

				System.out.print("*\t");

			}
			sp++;
			st--;
			System.out.println();
		}

	}

}
