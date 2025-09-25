package olddsamixcodes.numerics;

import java.util.Scanner;

/**
 * @author Vishwas Any Base Addition
 *
 */
public class DSA_43 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int b = scan.nextInt();

		int d = getSum(n1, n2, b);
		System.out.println(d);

	}

	private static int getSum(int n1, int n2, int b) {
		int rv = 0;
		int c = 0;
		int p = 1;
		while (n1 > 0 || n2 > 0 || c > 0) {
			int d1 = n1 % 10;
			int d2 = n2 % 10;
			n1 = n1 / 10;
			n2 = n2 / 10;

			int d = d1 + d2 + c;
			c = d / b;
			d = d % b;

			rv += d * p;
			p = p * 10;
		}

		return rv;
	}

}
