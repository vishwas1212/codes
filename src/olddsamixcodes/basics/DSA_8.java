package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas 
 * Find the total count of the given dsa.numbers
 *
 */
public class DSA_8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		int dig = 0;
		/*
		 * String number=scan.nextLine(); System.out.println(number.length());
		 */
		while (numbers != 0) {
			numbers = numbers / 10;
			dig++;
		}
		System.out.println(dig);

	}

}
