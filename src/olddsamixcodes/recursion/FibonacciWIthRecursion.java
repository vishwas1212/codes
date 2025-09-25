package olddsamixcodes.recursion;

public class FibonacciWIthRecursion {

	public static void main(String[] args) {
		int n = 1;
		int fibn = getFib(3);
		System.out.println(fibn);

	}

	private static int getFib(int n) {
		if (n <= 1) {
			return 1;
		}
		return getFib(n - 1) + getFib(n - 2);
	}

}
