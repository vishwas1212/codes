package olddsamixcodes.recursion;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(getFact(n));

	}

	private static int getFact(int n) {
		if (n >= 1) {
			return n * getFact(n - 1);
		}
		return 1;
	}

}
