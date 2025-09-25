package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Print a Diagonal
 *
 */
public class DSA_23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		/*
		 * 1st Approach
		 * 
		 * int st = 1; int sp = 0;
		 * 
		 * for(int i=1; i<=n; i++) { for(int k=1; k<=sp; k++) { System.out.print("\t");
		 * } System.out.print("*\t");
		 * 
		 * sp++; System.out.println(); }
		 * 
		 * 2nd Approach
		 */

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {

				if(i==j)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
				
			}
			System.out.println();
		}

	}

}
