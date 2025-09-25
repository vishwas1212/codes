package olddsamixcodes.demo;

public class PyramidImpl {

	public static void main(String[] args) {

		int n = 5;
		int sp = n - 1;

		for (int i = 0; i < n; i++) {
			for ( int k = n - i; k > 1; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
