package olddsamixcodes.numerics;

import java.util.Scanner;

/**
 * @author Vishwas Any Base to Decimal
 *
 */
public class DSA_41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b = scan.nextInt();

		int dec = getValueInDecimal(n, b);
		System.out.println(dec);

	}

	private static int getValueInDecimal(int n, int b) {
		int rv = 0;

		int p = 1;
		while (n > 0) {
			int dig = n % 10;
			n = n / 10;

			rv += dig * p;
			p = p * b;

		}

		return rv;
	}

}
