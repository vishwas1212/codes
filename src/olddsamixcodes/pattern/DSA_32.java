package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Pattern
 *
 */
public class DSA_32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int st = 1;
		int sp = 2 * n - 3;

		for (int i = 1; i <= n; i++) {

			int val = 1;

			for (int k = 1; k <= st; k++) {
				System.out.print(val + "\t");
				val++;
			}

			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			if (i == n) {
				val--;
				st--;
			}
			for (int k = 1; k <= st; k++) {
				val--;
				System.out.print(val + "\t");
			}

			sp -= 2;
			st++;

			System.out.println();
		}
	}

}
