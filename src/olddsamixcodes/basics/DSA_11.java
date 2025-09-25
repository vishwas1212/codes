package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Find the inverse of a number
 *
 */
public class DSA_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Actual Number "+n);
		
		//Initiating the inverse number
		int inv = 0;
		
		//Starting position 
		int op = 1;

		while (n != 0) {

			//Original Digit Remaining
			int od = n % 10;
			
			//keeping the original position in inverted inverted digit
			int id = op;
			
			//Keeping the original digit in inverted position
			int ip = od;

			//Calculation of inverted digits and positions
			//formula is inverse + inverted digit * 10*inverted position - 1
			inv = inv + id * (int) Math.pow(10, ip - 1);

			//Decreasing the number
			n = n / 10;
			
			//Increasing the original position gradually
			op++;

		}
		System.out.println("Inverted Number "+inv);

	}

}
