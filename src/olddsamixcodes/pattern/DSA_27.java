package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas print dsa.numbers
 *
 */
public class DSA_27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int val = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(val + "\t");
				val++;
			}

			System.out.println();
		}

	}

}
