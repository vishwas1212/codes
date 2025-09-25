package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas To find if given is right angle traingle
 *
 */
public class DSA_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int max = a;
		if (b >= max) {
			max = b;
		}

		if (c >= max) {
			max = c;
		}

		if (max == a) {
			boolean flag = ((b * b + c * c) == (a * a));
			System.out.println("A is the hypotenuse "+flag);

		} else if (max == b) {

			boolean flag = ((a * a + c * c) == (b * b));
			System.out.println(" B is the hypotenuse "+flag);

		} else {

			boolean flag = ((b * b + a * a) == (c * c));
			System.out.println("C is the hypotenuse "+flag);

		}

	}

}
