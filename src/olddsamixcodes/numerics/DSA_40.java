package olddsamixcodes.numerics;

import java.util.Scanner;

/**
 * @author Vishwas Decimal to any base
 *
 */
public class DSA_40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();

		int dec = getValueInBase(n, b);
		System.out.println(dec);

	}

	private static int getValueInBase(int n, int b) {
		int rv = 0;

		int p = 1;
		while (n > 0) {
			int dig = n % 8;
			n = n / 8;

			rv += dig * p;
			p = p * b;
		}

		return rv;
	}

}
