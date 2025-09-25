package olddsamixcodes.basics;

import java.util.Scanner;

public class DSA_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		String name = scan.nextLine();
		System.out.println("Hello " + name + " Here is your counting.");
		for (int i = 0; i <= number; i++) {
			System.out.println(i);
		}

		int j = 10;
		for (; j <= 10;) {
			System.out.println("j is " + j);
			j++;
		}

		int i = 1;
		while (i <= 10)
			;
		{
			System.out.println(i);
			i++;
		}

	}

}
