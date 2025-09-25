package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Pattern Programming for triangle shape
 *
 */
public class DSA_17 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
