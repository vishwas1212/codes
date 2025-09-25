package olddsamixcodes.basics;

import java.util.Scanner;

public class DSA_3 {

	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		if (i > 90) {
			System.out.println("excellent");
		} else if (i > 80 && i <= 90) {

			System.out.println("good");
		} else if (i > 70 && i <= 80) {

			System.out.println("fair");
		} else if (i > 60 && i <= 70) {

			System.out.println("meets expectations");
		}

		else if (1<=60) {
			
			System.out.println("not par");
		}
	}

}
