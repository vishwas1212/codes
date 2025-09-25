package olddsamixcodes.numerics;

import java.util.Scanner;

/**
 * @author Vishwas Multiplication of any base
 *
 */
public class DSA_45 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int b = scan.nextInt();

		int d = getMultiplication(b, n1, n2);
		System.out.println(d);

	}

	private static int getMultiplication(int b, int n1, int n2) {
		int rv = 0;

		int p = 1;
		while (n2 > 0) {

			int d2 = n2 % 10;
			n2 = n2 / 10;

			int sprd = getMultiplicationAsASingleDigit(b, n1, d2);
			rv = getSum(b, rv, sprd * p);
			p = p * 10;

		}
		return rv;
	}

	private static int getSum(int b, int rv, int i) {
		int sv = 0;

		int c = 0;
		int p = 1;

		while (rv > 0 || i > 0 || c > 0) {

			int d1 = rv % 10;
			rv = rv / 10;
			int d2 = i % 10;
			i = i / 10;

			int d = d1 + d2 + c;
			c = d / b;
			d = d % b;

			sv += d * p;
			p = p * 10;

		}

		return sv;
	}

	private static int getMultiplicationAsASingleDigit(int b, int n1, int d2) {
		int rv = 0;
		int c = 0;
		int p = 1;
		while (n1 > 0 || c > 0) {
			int d1 = n1 % 10;
			n1 = n1 / 10;
			int d = d1 * d2 + c;
			c = d / b;
			d = d % b;
			rv += d * p;
			p = p * 10;
		}
		return rv;
	}

}
