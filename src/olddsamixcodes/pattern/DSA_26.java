package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Hollow Diamond
 *
 */
public class DSA_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sp = n / 2;
		int st = 1;
		int sp1 = -1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			System.out.print("*\t");

			for (int j = 1; j <= sp1; j++) {
				System.out.print("\t");
			}

			/*
			 * if(sp1==-1) my way
			 */
			if (i > 1 && i < n) {
				System.out.print("*\t");
			}
			if (i <= n / 2) {
				sp--;
				sp1 += 2;
			} else {
				sp++;
				sp1 -= 2;
			}
			System.out.println();
		}

	}

}
