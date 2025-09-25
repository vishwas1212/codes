package olddsamixcodes.demo;

public class NearesValueToIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 4;
		int nv = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != d) {
				nv = d;
			} else {
				if (d - arr[i - 1] > arr[i + 1] - d) {
					nv = arr[i + 1];
					System.out.println("nv = arr[i + 1] : " + nv);
				} else {
					nv = arr[i - 1];
					System.out.println("nv = arr[i - 1] : " + nv);
				}
			}
		}

		System.out.println(nv);

	}

}
