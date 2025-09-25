package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Prime or Not
 *
 */
public class DSA_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the times u want to check");
		int t = scan.nextInt();
		System.out.println("Entered times is " + t);

		for (int i = 0; i < t; i++) {

			System.out.println("Enter the number to be checked");
			int n = scan.nextInt();
			int count = 0;

			/*
			 * for (int div = 1; div <= n; div++) Optimize way to do it
			 */
			for (int div = 2; div * div <= n; div++) {
				if (n % div == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(n + " number is prime ");
			} else {
				System.out.println(n + " number is not prime");
			}

		}

	}

}
