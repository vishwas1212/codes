package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Pattern for reverse triangle
 *
 */
public class DSA_18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println();

		}

	}

}
