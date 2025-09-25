package olddsamixcodes.array;

import java.util.Scanner;

/**
 * @author Vishwas Bar Chart Problem
 *
 */
public class DSA_49 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scan.nextInt();
		}

		int max = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		for(int floor=max; floor>=1; floor--)
		{
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]>=floor)
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
