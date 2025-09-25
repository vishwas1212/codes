package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Find GCD and LCM
 *
 */
public class DSA_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		int on1 = n1;
		int on2 = n2;

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		int gcd = n2;
		int lcm = (on1 * on2) / gcd;

		System.out.println("GCD " + gcd);
		System.out.println("LCM " + lcm);

	}

}
