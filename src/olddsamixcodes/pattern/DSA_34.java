package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Damru Pattern Programming
 *
 */
public class DSA_34 {

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
				if (i > 1 && i <= n / 2 && j > 1 && j < st)
				{
					System.out.print("\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}

			if (i <= n / 2) {
				st -= 2;
				sp++;
			} else {
				st += 2;
				sp--;
			}

			System.out.println();
		}

	}

}
