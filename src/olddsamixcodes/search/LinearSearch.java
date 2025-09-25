package olddsamixcodes.search;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };
		int noToBeFound = 200;
		int index=-1;
		boolean notFound = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == noToBeFound) {
				 index = i;
			} 
		}
		System.out.println(index);
	}
}
