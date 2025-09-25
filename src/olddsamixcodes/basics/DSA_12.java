package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Rotation of a number
 *
 */
public class DSA_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		// for finding the no of digits
		int temp, nod = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			nod++;
		}
		System.out.println(nod);

		//if k is greater that nod
		k = k % nod;
		
		//if k is negative
		if (k < 0) {

			k = k + nod;
		}

		int mul = 1;
		int div = 1;

		for (int i = 1; i <= nod; i++) {
			if (i <= k) {
				div = div * 10;
			} else {
				mul = mul * 10;
			}
		}

		int q = n / div;
		int r = n % div;

		int rotation = r * mul + q;
		System.out.println(rotation);

	}

}
