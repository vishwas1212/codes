package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Prime factorisation of a number
 *
 */
public class DSA_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int div = 2; div * div <= n; div++) {

			while (n % div == 0) {
				n = n / div;
				System.out.println(div + " ");
			}
		}
		if (n != 1) {
			System.out.println(n);
		}

	}

}
