package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Diamond Pattern
 *
 */
public class DSA_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= sp; k++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}

			System.out.println();
		}

	}

}
