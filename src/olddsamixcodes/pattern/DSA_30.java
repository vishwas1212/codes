package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Counting of table x
 *
 */
public class DSA_30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= 10; i++) {

			int val = n * i;
			System.out.println(n + " * " + i + " = " + val);
		}

	}

}
