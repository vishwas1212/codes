package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Pattern programming to print traingle
 *
 */
public class DSA_19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sp = n - 1;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			for (int j = 1; j <= st; j++) {
				System.out.print("*\t");
			}

			sp--;
			st++;
			System.out.println();
		}

	}

}
