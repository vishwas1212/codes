package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Print Fibonaci series
 *
 */
public class DSA_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int fib1 = 0, fib2 = 1, sum;
		for (int i = 0; i < n; i++) {

			System.out.println("Fibonacci Numbers are " + fib1);
			sum = fib1 + fib2;
			fib1 = fib2;
			fib2 = sum;

		}
	}

}
