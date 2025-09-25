package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Print X shape
 *
 */
public class DSA_25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		/*
		 * int sp = 0; int sp1 = n / 2 + 1; int st = 1;
		 * 
		 * for (int i = 1; i <= n; i++) {
		 * 
		 * for (int k = 1; k <= sp; k++) { System.out.print("\t"); }
		 * 
		 * for (int j = 1; j <= st; j++) { System.out.print("*\t"); }
		 * 
		 * for (int k = 1; k <= sp1; k++) { System.out.print("\t"); }
		 * 
		 * if (sp1 == -1) { System.out.print("\t"); } else {
		 * 
		 * for (int j = 1; j <= st; j++) { System.out.print("*\t"); } }
		 * 
		 * if (i <= n / 2) {
		 * 
		 * sp++; sp1 -= 2;
		 * 
		 * } else { sp--; sp1 += 2; } System.out.println();
		 * 
		 * }
		 */
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j||i+j==n+1)
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
