package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Hollow Rectangle Program
 *
 */
public class DSA_22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int st = n / 2 + 1;
		int sp = 1;

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*\t");
			}

			if (i < n / 2 + 1) {

				st--;
				sp += 2;
			} else {
				st++;
				sp -= 2;
			}
			System.out.println();
		}

	}

}
