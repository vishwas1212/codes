package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Reverse a diagonal
 *
 */
public class DSA_24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		/* 1st Approach
		 * int sp = n - 1;
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * for (int j = 1; j <= sp; j++) { System.out.print("\t"); }
		 * System.out.print("*\t"); sp--; System.out.println();
		 * 
		 * }
		 *2nd Approach
		 */
		 
		 for(int i=1; i<=n; i++)
		 {
			 for(int j=1; j<=n; j++)
			 {
				 if(i+j==n+1)
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
