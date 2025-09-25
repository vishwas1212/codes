package olddsamixcodes.numerics;

import java.util.Scanner;

/**
 * @author Vishwas Find the digit frequency
 *
 */
public class DSA_39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();

		int f = getDigitFrequency(n, d);
		System.out.println(f);

	}

	private static int getDigitFrequency(int n, int d) {
		int rv = 0;

		while (n > 0) {

			int dig = n % 10;
			n = n / 10;
			if (dig == d) {
				rv++;
			}

		}
		return rv;
	}

}
