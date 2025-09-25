package olddsamixcodes.numerics;



import java.util.Scanner;

/**
 * @author Vishwas Any Base to Any Base
 *
 */
public class DSA_42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b1 = scan.nextInt();
		int b2 = scan.nextInt();

		int d = getValue(n, b1, b2);
		System.out.println(d);

	}

	private static int getValue(int n, int b1, int b2) {
		int dec = anyBaseToDecimal(n, b1);
		int dn = decimalToAnyBase(dec, b2);
		return dn;
	}

	private static int decimalToAnyBase(int dec, int b2) {
		int rv = 0;

		int p = 1;
		while (dec > 0) {
			int dig = dec % b2;
			dec = dec / b2;
			rv += dig * p;
			p = p * 10;
		}
		return rv;
	}

	private static int anyBaseToDecimal(int n, int b1) {
		int rv = 0;

		int p = 1;
		while (n > 0) {
			int dig = n % 10;
			n = n / 10;
			rv += dig * p;
			p = p * b1;
		}

		return rv;
		
	}

}
