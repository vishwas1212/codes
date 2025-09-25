package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Arrow Pattern
 *
 */
public class DSA_33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int st = 1;
		int sp = n / 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				if (i == n / 2 + 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}

			}

			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				st++;
			} else {
				st--;
			}

			System.out.println();
		}

	}

}
