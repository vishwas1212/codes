package olddsamixcodes.demo;

public class WebProg {

	public static void main(String[] args) {
		/*
		 * String[] arr = ["1","2","3","4"]; String[] string = arr.replaceAll("\\{", "")
		 * .replaceAll("}", "") .split(","); int[] arr1=new int[arr.length]; // int[]
		 * dsa.numbers =
		 * Arrays.stream(arr.split(",")).mapToInt(Integer::parseInt).toArray();
		 */

		int[] arr = { 8, 4, 2, 5, 1, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 10) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}