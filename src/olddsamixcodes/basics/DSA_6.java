package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Print prime with in a range
 *
 */
public class DSA_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int low = scan.nextInt();
		System.out.println("Lower Limit " + low);

		int high = scan.nextInt();
		System.out.println("Higher Limit " + high);

		for (int i = low; i <= high; i++) {
			int count = 0;

			for (int div = 2; div * div <= i; div++) {
				if (i % div == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println("Prime " + i);
			} else {
				System.out.println("Not Prime " + i);
			}

		}
	}

}
