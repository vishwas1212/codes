package olddsamixcodes.basics;

import java.util.Scanner;

/**
 * @author Vishwas Print the dsa.numbers from left to right in seprate line
 *
 */
public class DSA_9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Get the number
		int n = scan.nextInt();
		
		int nod = 0, temp;
		
		//store the actual no in temp
		temp = n;
		
		//checking until temp is not equal to 0
		while (temp != 0) {
			//to get the quotient
			temp = temp / 10;
			
			//increasing the nod evertime it finds
			nod++;
		}
		System.out.println(nod);

		//Finding the divisor according to the taken number
		int div = (int) Math.pow(10, nod - 1);
		
		//checking until diviosr is not equal to 0
		while (div != 0) {
			
			//storing and showing the quotient one by one
			int q = n / div;
			System.out.println(q);
			
			//getting the remainder from the actual number and so on
			n = n % div;
			
			//fixing the divisor according to the remaining number
			div = div / 10;
		}

	}

}
