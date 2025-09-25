package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Permutation and Triangle
 *
 */
public class DSA_29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i <= n; i++) {

			int icj = 1;
			for (int j = 0; j <= i; j++) {

				System.out.print(icj + "\t");
				int icjp1 = icj * (i - j) / (j + 1);
				icj = icjp1;
			}
			System.out.println();
		}

	}

}
