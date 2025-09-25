package olddsamixcodes.pattern;

import java.util.Scanner;

/**
 * @author Vishwas Diamond and Numbers
 *
 */
public class DSA_31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sp = n / 2;
		int st = 1;

		int val = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}

			int cval = val;
			for (int k = 1; k <= st; k++) {
				System.out.print(cval + "\t");
				if (k <= st / 2) {
					cval++;
				} else {
					cval--;
				}

			}
			if (i <= n / 2) {
				sp--;
				st += 2;
				val++;
			} else {
				sp++;
				st -= 2;
				val--;
			}

			System.out.println();
		}

	}

}
