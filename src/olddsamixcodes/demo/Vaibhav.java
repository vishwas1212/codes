package olddsamixcodes.demo;

class Vaibhav {
	public static void main(String[] args) {
		for (int i = 7; i >= 1; i--) {
			for (int k = 7; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == 1 || j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 7; i++) {
			for (int k = 7; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 2 * i - 1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.print(" ");

				if (i == 1 || j == 4 || i == 7) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 7; i++) {
			System.out.print(" ");
			for (int j = 1; j <= 12; j++) {
				if (i == 1 || i == 3 || i == 2 && j == 12 || j == 1 || i == 5 || i == 7 || i == 6 && j == 12) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.print("  ");
			for (int j = 1; j <= 10; j++) {
				if (i == 5 || j == 1 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 7; i++) {
			for (int k = 7; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 2 * i - 1)
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 7; i >= 1; i--) {
			for (int k = 7; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == 1 || j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}