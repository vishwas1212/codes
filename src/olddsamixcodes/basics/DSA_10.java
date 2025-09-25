package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas printing the number in the reverse format
 *
 */
public class DSA_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n);

		// Optimise way to do it
		while (n > 0) {

			int remainder = n % 10;
			n = n / 10;
			System.out.println(remainder);
		}

		/*
		 * int nod = 0, temp, temp1, reverse = 0; temp = n; temp1 = n;
		 * 
		 * while (temp1 != 0) {
		 * 
		 * int remainder = temp1 % 10; reverse = reverse * 10 + remainder; temp1 = temp1
		 * / 10; } System.out.println(reverse);
		 * 
		 * while (temp != 0) {
		 * 
		 * temp = temp / 10; nod++; } System.out.println(nod);
		 * 
		 * int div = (int) Math.pow(10, nod - 1);
		 * 
		 * while (div != 0) {
		 * 
		 * int q = reverse / div; System.out.println(q);
		 * 
		 * reverse = reverse % div; div = div / 10; }
		 */
	}

}
