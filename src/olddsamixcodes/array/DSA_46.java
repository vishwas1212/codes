package olddsamixcodes.array;

/**
 * @author Vishwas Swap of two dsa.numbers in array
 *
 */
public class DSA_46 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		arr[0] = 33;
		arr[1] = 47;
		arr[2] = 59;
		arr[3] = 79;
		arr[4] = 98;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Before Swap\t" + arr[i]);
		}

		swap(arr, 0, 4);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("After Swap\t" + arr[i]);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
